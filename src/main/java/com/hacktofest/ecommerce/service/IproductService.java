package com.hacktofest.ecommerce.service;

import com.hacktofest.ecommerce.entity.Product;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface IproductService {

    public List<Product> listarProductos();
    public Product buscarProducto(Integer id);
}
