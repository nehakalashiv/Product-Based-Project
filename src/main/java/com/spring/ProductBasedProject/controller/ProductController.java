package com.spring.ProductBasedProject.controller;

import com.spring.ProductBasedProject.entity.Product;
import com.spring.ProductBasedProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/getAllProduct")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
    @PostMapping("/saveToProduct")
    public Product saveToProduct(@RequestBody Product product){
        return productService.save(product);
    }
    @PutMapping("/saveToProduct/{productId}")
    public Product updateProduct(@PathVariable("productId") int productId,@RequestBody Product product){
        return productService.updateProduct(productId,product);
    }
    @DeleteMapping("/saveToProduct/{productId}")
    public String deleteProductById(@PathVariable("productId") int productId){
         productService.deleteProductById(productId);
         return "Deleted Successfully";
    }
    @GetMapping("/saveToProduct/{productId}")
    public Product fetchProductById(@PathVariable("productId") int productId) {
        return productService.fetchProductById(productId);
    }
}
