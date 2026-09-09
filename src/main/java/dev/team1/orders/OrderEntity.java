package dev.team1.orders;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_order")
    private Long id;

    @Column(nullable = false, scale = 2)
    private BigDecimal subtotal;

    private Integer discountRate;// for discount percentage (e.g.5%)

    @Column(nullable = false, scale = 2) // for the discount amount (e.g. 2.5 euro)
    private BigDecimal discountAmount;

    @Column(nullable = false)
    private Integer vatRate;

    @Column(nullable = false, scale = 2)
    private BigDecimal vatAmount;

    @Column(nullable = false, scale = 2)
    private BigDecimal total;

    private String chefNote;

}
