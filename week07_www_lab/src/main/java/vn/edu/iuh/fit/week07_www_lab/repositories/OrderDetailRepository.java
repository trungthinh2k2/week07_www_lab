package vn.edu.iuh.fit.week07_www_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.week07_www_lab.models.OrderDetail;
import vn.edu.iuh.fit.week07_www_lab.pks.OrderDetailPK;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}