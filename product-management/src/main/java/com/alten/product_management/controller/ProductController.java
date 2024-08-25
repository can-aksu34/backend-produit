package com.alten.product_management.controller;

import com.alten.product_management.model.Product;
import com.alten.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    // Endpoint pour recuperer tous les produits
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Endpoint pour récupérer un produit par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    // Endpoint pour creer un nouveau produit
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    // Endpoint pour mettre à jour un produit existant par son ID
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        try {
            Product updatedProduct = productService.updateProduct(id, productDetails);
            return ResponseEntity.ok(updatedProduct);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint pour supprimer un produit par son ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}