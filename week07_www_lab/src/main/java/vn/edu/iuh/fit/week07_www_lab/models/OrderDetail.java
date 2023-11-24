package vn.edu.iuh.fit.week07_www_lab.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.week07_www_lab.pks.OrderDetailPK;

@Entity
@Table(name = "order_detail")
@IdClass(OrderDetailPK.class)
public class OrderDetail {
    @Column(name = "quantity", nullable = false)
    private double quantity;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note", length = 255, nullable = true)
    private String note;

    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @JoinColumn(name = "product_id")
    @ManyToOne
    private Product product;
}
