package dev.team1.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.team1.contracts.IProductsService;
import dev.team1.enums.ProductCategory;
import dev.team1.products.dtos.ProductDTOResponse;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping(path = "${api-endpoint}/products")
public class ProductsController {

    private IProductsService productsService;

    public ProductsController(IProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("")
    public ResponseEntity<List<ProductDTOResponse>> index(
        @RequestParam(required = false) ProductCategory category
    ) {
        if (category != null) {
            return ResponseEntity.ok(
                productsService.getByCategory(category)
            );
        }
        
        return ResponseEntity.ok(
            productsService.getAll()
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTOResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(
            productsService.getById(id)
        );
    }

}
