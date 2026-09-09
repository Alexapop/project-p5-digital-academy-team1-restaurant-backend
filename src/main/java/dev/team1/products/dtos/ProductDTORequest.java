package dev.team1.products.dtos;

import java.math.BigDecimal;

import dev.team1.enums.ProductCategory;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public record ProductDTORequest(
    @NotBlank 
    String name,

    @NonNull 
    ProductCategory category,
    
    @NotBlank 
    String description,
    
    @NotBlank 
    String imageUrl,
    
    @NonNull 
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer = 10, fraction = 2)
    BigDecimal price,
    
    @Min(value = 0)
    @Digits(integer = 3, fraction = 0)
    int discount,
    
    boolean available,
    
    boolean exclusive
) {

}
