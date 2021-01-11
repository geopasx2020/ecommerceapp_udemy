package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Integer> { //path /products
    List<Product> findByDescription(String description);

}

