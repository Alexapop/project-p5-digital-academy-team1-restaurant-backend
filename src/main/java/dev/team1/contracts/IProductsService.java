package dev.team1.contracts;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import dev.team1.enums.ProductCategory;
import dev.team1.products.dtos.ProductDTOResponse;

public interface IProductsService extends IGenericGetService<ProductDTOResponse> {

    public Page<ProductDTOResponse> getByCategory(ProductCategory category, Pageable pageable);
    
    public Page<ProductDTOResponse> getAllAvailable(Pageable pageable);

}
