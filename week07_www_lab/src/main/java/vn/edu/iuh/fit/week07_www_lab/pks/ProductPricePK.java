package vn.edu.iuh.fit.week07_www_lab.pks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPricePK implements Serializable {
    private long product;
    private LocalDateTime price_date_time;
}
