package com.hacktofest.ecommerce.controller;


import com.hacktofest.ecommerce.entity.Product;
import com.hacktofest.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> list(){
        return service.listarProductos();
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable Integer id){
        return service.buscarProducto(id);
    }


}
