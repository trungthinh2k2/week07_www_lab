package vn.edu.iuh.fit.week07_www_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.week07_www_lab.models.ProductImage;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}