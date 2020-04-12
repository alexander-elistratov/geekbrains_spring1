package ru.geekbrains.persist;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ProductRepository {
    private final AtomicInteger identity = new AtomicInteger(0);

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        insert(new Product("apple", 10));
        insert(new Product("orange", 20));
        insert(new Product("tomato", 30));
    }

    public void insert(Product product) {
        product.setId(identity.incrementAndGet());
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
