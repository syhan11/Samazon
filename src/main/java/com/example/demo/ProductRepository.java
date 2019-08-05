package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);

    ArrayList<Product>findAllByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String searchstring, String str2);

    ArrayList<Product>findAllByNameContainingIgnoreCase(String searchstring);
    ArrayList<Product>findAllByDescriptionContainingIgnoreCase(String searchstring);

    ArrayList<Product>findDistinctByNameContainingIgnoreCase(String searchstring);
    ArrayList<Product>findDistinctByDescriptionContainingIgnoreCase(String searchstring);



    Iterable<Product> findAllByCategory(String category);

}
