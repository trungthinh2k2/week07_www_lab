package vn.edu.iuh.fit.week07_www_lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.week07_www_lab.models.Product;
import vn.edu.iuh.fit.week07_www_lab.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String showAll(Model model){
        List<Product> products = productRepository.findAll();
        model.addAttribute("products",products);
        return  "product/products";
    }
    @GetMapping("/productDetail/{id}")
    public String viewDetail(Model model, @PathVariable("id") long id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            model.addAttribute("product",product.get());
        }else{
            model.addAttribute("product",new Product());
        }
        return "product/productView";
    }

    @GetMapping("/update/{id}")
    public  String update(Model model, @PathVariable("id") long id){
        Product product = productRepository.findById(id).get();
        model.addAttribute("product", product);
        return  "product/productUpdate";
    }

    @PostMapping("/update")
    public  String update(@ModelAttribute("product")  Product product){
        productRepository.save(product);
        return  "redirect:/";
    }
}
