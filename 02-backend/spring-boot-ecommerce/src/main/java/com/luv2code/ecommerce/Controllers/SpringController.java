package com.luv2code.ecommerce.Controllers;

import java.util.List;

import com.luv2code.ecommerce.dao.ProductRepository;
import com.luv2code.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

@CrossOrigin(origins="*",allowedHeaders={"*"})
@RestController
public class SpringController {
    @Autowired
    ProductRepository products;

    @JsonIgnore
    @GetMapping({ "findByDescription/{description}" })
    public List<Product> findByDescription(@PathVariable String description) {

        return products.findByDescription(description);
    }

}