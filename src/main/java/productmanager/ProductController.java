package com.bierkreek.productmanager.controller;

import com.bierkreek.productmanager.model.Product;
import com.bierkreek.productmanager.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public String create(@RequestBody Product p) {
        repo.save(p);
        return "Product saved";
    }
}
