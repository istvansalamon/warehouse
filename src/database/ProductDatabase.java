package database;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private List<Product> products;

    public ProductDatabase() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product updatedProduct) {
        for (Product product : products) {
            if (product.getProductId().equals(updatedProduct.getProductId())) {
                product.setName(updatedProduct.getName());
                product.setPrice((int) updatedProduct.getPrice());
                break;
            }
        }
    }

    public void deleteProduct(String productId) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
