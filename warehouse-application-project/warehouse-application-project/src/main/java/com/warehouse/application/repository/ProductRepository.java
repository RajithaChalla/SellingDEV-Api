package com.warehouse.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.warehouse.application.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
