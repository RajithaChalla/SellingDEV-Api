package com.warehouse.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.warehouse.application.entity.Product;
import com.warehouse.application.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product product) {
        Optional<Product> existingProductOptional = productRepository.findById(id);
        if (existingProductOptional.isPresent()) {
            Product existingProduct = existingProductOptional.get();
            existingProduct.setProdId(product.getProdId());
            existingProduct.setProductName(product.getProductName());
            existingProduct.setArticles(product.getArticles());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        } else {
            return null; 
        }
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

}
