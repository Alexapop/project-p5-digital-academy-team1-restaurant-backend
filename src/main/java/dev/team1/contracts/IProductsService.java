package dev.team1.contracts;

import java.util.List;

import dev.team1.enums.ProductCategory;
import dev.team1.products.dtos.ProductDTOResponse;

public interface IProductsService {

    public List<ProductDTOResponse> getByCategory(ProductCategory category);

}
