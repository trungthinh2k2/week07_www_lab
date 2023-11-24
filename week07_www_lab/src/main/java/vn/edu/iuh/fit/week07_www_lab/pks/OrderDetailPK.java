package vn.edu.iuh.fit.week07_www_lab.pks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailPK implements Serializable {
    private long order;
    private long product;
}
