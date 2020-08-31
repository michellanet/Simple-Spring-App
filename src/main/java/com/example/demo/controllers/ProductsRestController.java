/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.models.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author michellanet
 */
@RestController
public class ProductsRestController {

    @GetMapping("/products")
    public List<Product> Products() {

        ArrayList<Product> products = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Product product = new Product("Product" + i, i * 4, i * 2.3);
            products.add(product);
        }

        return products;
    }
}
