package com.alten.product_management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data // Genere les getters, setters, toString, equals, et hashCode
@NoArgsConstructor // Genere un constructeur sans arguments
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String code;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "inventory_status", nullable = false, length = 50)
    private String inventoryStatus;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(nullable = false)
    private Double rating;

}