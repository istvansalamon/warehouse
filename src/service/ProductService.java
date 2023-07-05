package service;

import database.ProductDatabase;
import model.Product;

import java.util.List;

public class ProductService {
    private ProductDatabase productDatabase;

    public ProductService(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
    }

    public void addProduct(Product product) {
        productDatabase.addProduct(product);
    }

    public void updateProduct(Product updatedProduct) {
        productDatabase.updateProduct(updatedProduct);
    }

    public void deleteProduct(String productId) {
        productDatabase.deleteProduct(productId);
    }

    public List<Product> getProducts() {
        return productDatabase.getProducts();
    }
}
