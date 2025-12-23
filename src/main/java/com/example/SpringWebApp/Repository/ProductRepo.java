package com.example.SpringWebApp.Repository;

import com.example.SpringWebApp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {
}
