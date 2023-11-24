package vn.edu.iuh.fit.week07_www_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.week07_www_lab.models.ProductPrice;
import vn.edu.iuh.fit.week07_www_lab.pks.ProductPricePK;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, ProductPricePK> {
}