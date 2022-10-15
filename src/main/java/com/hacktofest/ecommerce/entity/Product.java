package com.hacktofest.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String priceSupplier;
    private String price;

    public Product() {
    }

    public Product(Integer id, String name, String description, String priceSupplier, String price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceSupplier = priceSupplier;
        this.price = price;
    }
}
