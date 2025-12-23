package com.example.SpringWebApp.controller;

import com.example.SpringWebApp.services.ProductService;
import com.example.SpringWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Products> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Products getProductsById(@PathVariable int prodId){
        return productService.getProductsById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products p){
        productService.addProduct(p);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Products p){
        productService.updateProducts(p);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProducts(prodId);
    }
}
