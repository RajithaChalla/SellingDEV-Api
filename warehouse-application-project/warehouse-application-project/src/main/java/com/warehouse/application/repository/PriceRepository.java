package com.warehouse.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.warehouse.application.entity.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, String> {

	 

}
