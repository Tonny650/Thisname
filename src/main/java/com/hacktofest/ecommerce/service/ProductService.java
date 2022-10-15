package com.hacktofest.ecommerce.service;

import com.hacktofest.ecommerce.entity.Product;
import com.hacktofest.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IproductService{

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> listarProductos() {
        return repository.findAll();
    }

    @Override
    public Product buscarProducto(Integer id) {
        return repository.findById(id).get();
    }
}
