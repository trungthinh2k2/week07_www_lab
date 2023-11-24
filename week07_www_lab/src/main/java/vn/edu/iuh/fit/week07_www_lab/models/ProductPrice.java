package vn.edu.iuh.fit.week07_www_lab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.week07_www_lab.pks.ProductPricePK;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
@IdClass(ProductPricePK.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrice {
    @Id
    @JoinColumn(name = "product_id")
    @ManyToOne
    private Product product;
    @Id
    @Column(name = "price_date_time")
    private LocalDateTime price_date_time;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note")
    private String note;

    public ProductPrice( double price, String note) {
        this.price_date_time = LocalDateTime.now();
        this.price = price;
        this.note = note;
    }
}
