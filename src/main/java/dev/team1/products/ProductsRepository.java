package dev.team1.products;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.team1.enums.ProductCategory;

public interface ProductsRepository extends JpaRepository<ProductEntity, Long>{

    @Query("select p from products p where p.category = ?1 and p.available = true")
    public List<ProductEntity> findByCategory(ProductCategory category);

}
