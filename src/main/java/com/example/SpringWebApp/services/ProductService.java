package com.example.SpringWebApp.services;

import com.example.SpringWebApp.Repository.ProductRepo;
import com.example.SpringWebApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;



//     List<Products> products = new ArrayList<>(Arrays.asList(
//             new Products(100, "dell", 10000),
//             new Products(101, "HP" ,20000),
//             new Products(102,"ACER",30000)));

     public List<Products> getProducts(){
         return productRepo.findAll();
         //return products;
     }


    public Products getProductsById(int prodId) {
         return productRepo.findById(prodId).get();
         //return products.stream().filter(p ->p.getProdID() == prodId).findFirst().get();
    }

    public void addProduct(Products p){
        productRepo.save(p);
         //products.add(p);
    }


    public void updateProducts(Products p) {
         productRepo.save(p);
//         int index=0;
//
//         for (int i=0 ;i<products.size();i++) {
//             if (products.get(i).getProdID()== p.getProdID()) {
//                    index = i;
//             }
//         }
//         products.set(index, p);

    }

    public void deleteProducts(int prodId) {
         productRepo.deleteById(prodId);
         //products.removeIf(p -> p.getProdID() == prodId);

    }
}
