package dev.team1.products;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.team1.enums.ProductCategory;

public interface ProductsRepository extends JpaRepository<ProductEntity, Long>{

    public List<ProductEntity> findByCategory(ProductCategory category);

}
