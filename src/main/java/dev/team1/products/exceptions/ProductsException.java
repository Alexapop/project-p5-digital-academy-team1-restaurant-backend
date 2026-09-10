package dev.team1.products.exceptions;

public class ProductsException extends RuntimeException {

    public ProductsException(String message) {
        super(message);
    }

    public ProductsException(String message, Throwable cause) {
        super(message, cause);
    }

}
