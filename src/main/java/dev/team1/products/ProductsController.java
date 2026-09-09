package dev.team1.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.team1.contracts.IProductsService;

@RestController 
@RequestMapping(path = "${api-endpoint}/products")
public class ProductsController {

    private IProductsService productsService;

    public ProductsController(IProductsService productsService) {
        this.productsService = productsService;
    }

    

}
