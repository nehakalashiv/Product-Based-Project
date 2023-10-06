package com.spring.ProductBasedProject.service;

import com.spring.ProductBasedProject.entity.Product;
import com.spring.ProductBasedProject.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(int ProductId) {
        productRepository.deleteById(ProductId);

    }

    @Override
    public Product fetchProductById(int productId) {
        Optional<Product> product =
                productRepository.findById(productId);

        if(!product.isPresent()) {
            return null;
        }

        return  product.get();
    }


}
