package com.warehouse.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.warehouse.application.entity.Price;
import com.warehouse.application.service.PriceService;

public class PriceController {
	   @Autowired
	    private PriceService priceService;

	    @GetMapping
	    public ResponseEntity<List<Price>> getAllPrices() {
	        List<Price> prices = priceService.getAllPrices();
	        return new ResponseEntity<>(prices, HttpStatus.OK);
	    }

	    @GetMapping("/{artId}")
	    public ResponseEntity<Price> getPriceByArtId(@PathVariable String artId) {
	        Price price = priceService.getPriceByArtId(artId);
	        if (price != null) {
	            return new ResponseEntity<>(price, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Price> createPrice(@RequestBody Price price) {
	        Price createdPrice = priceService.createPrice(price);
	        return new ResponseEntity<>(createdPrice, HttpStatus.CREATED);
	    }

	    @PutMapping("/{artId}")
	    public ResponseEntity<Price> updatePrice(@PathVariable String artId, @RequestBody Price price) {
	        Price updatedPrice = priceService.updatePrice(artId, price);
	        if (updatedPrice != null) {
	            return new ResponseEntity<>(updatedPrice, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{artId}")
	    public ResponseEntity<Void> deletePrice(@PathVariable String artId) {
	        priceService.deletePrice(artId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	}


