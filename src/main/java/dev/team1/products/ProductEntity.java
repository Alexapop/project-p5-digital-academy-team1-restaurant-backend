package dev.team1.products;

import java.math.BigDecimal;

import dev.team1.enums.ProductCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "products")
@NoArgsConstructor 
@AllArgsConstructor 
@Getter
@Setter
public class ProductEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "category")
    private ProductCategory category;

    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Column(name = "image_url", nullable = false, length = 255)
    private String imageUrl;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "discount", nullable = true)
    private int discount; // para porcentaje !!!

    @Column(name = "available")
    private boolean available = true;

    @Column(name = "exclusive")
    private boolean exclusive = false;

    // @OneToMany(mappedBy = "product")
    // private List<OrderProduct> orderProducts = new ArrayList<>();

}
