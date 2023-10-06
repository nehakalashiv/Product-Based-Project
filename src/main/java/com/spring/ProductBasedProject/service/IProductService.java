package com.spring.ProductBasedProject.service;

import com.spring.ProductBasedProject.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
   public List<Product> getAllProduct();
   public Product save(Product product);
   public Product updateProduct(int productId,Product product);
   public void deleteProductById(int ProductId);
   public Product fetchProductById(int productId);

}
