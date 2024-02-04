package com.example.demo.models.Products;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Products")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    Integer productID;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;
}
