package dev.team1.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.team1.contracts.IProductsService;
import dev.team1.enums.ProductCategory;
import dev.team1.mappers.ProductMapper;
import dev.team1.products.dtos.ProductDTOResponse;
import dev.team1.products.exceptions.ProductsExceptionNotFound;

@Service 
public class ProductsService implements IProductsService {

    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTOResponse> getAll() {
        List<ProductDTOResponse> products = new ArrayList<>();
        
        productsRepository.findAll().forEach(p -> {
            ProductDTOResponse dto = ProductMapper.toDTO(p);
            products.add(dto);
        });
        return products;
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTOResponse getById(Long id) {
        ProductEntity product = productsRepository.findById(id)
            .orElseThrow(() -> new ProductsExceptionNotFound("Cannot find product with id " + id + " because it doesn't exist."));
        
        return ProductMapper.toDTO(product);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTOResponse> getByCategory(ProductCategory category) {
        List<ProductDTOResponse> products = new ArrayList<>();
        
        productsRepository.findByCategory(category).forEach(p -> {
            ProductDTOResponse dto = ProductMapper.toDTO(p);
            products.add(dto);
        });
        return products;
    }

}
