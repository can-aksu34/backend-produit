package com.alten.product_management.service;

import com.alten.product_management.model.Product;
import com.alten.product_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    // Récupère tous les produits triés par ID
    public List<Product> getAllProducts() {
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    // Récupère un produit par son ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
    // Crée un nouveau produit
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    // Met à jour un produit existant par son ID
    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));

        product.setCode(productDetails.getCode());
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        product.setInventoryStatus(productDetails.getInventoryStatus());
        product.setCategory(productDetails.getCategory());
        product.setImage(productDetails.getImage());
        product.setRating(productDetails.getRating());

        return productRepository.save(product);
    }
    // Supprime un produit par son ID
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
        productRepository.delete(product);
    }
}