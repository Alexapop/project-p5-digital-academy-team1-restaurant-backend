package dev.team1.contracts;

import java.util.List;

import dev.team1.enums.ProductCategory;
import dev.team1.products.dtos.ProductDTOResponse;

public interface IProductsService extends IGenericGetService<ProductDTOResponse> {

    public List<ProductDTOResponse> getByCategory(ProductCategory category);

}
