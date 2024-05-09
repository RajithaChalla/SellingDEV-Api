package com.warehouse.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.application.entity.Price;
import com.warehouse.application.repository.PriceRepository;

@Service
public class PriceService {
	@Autowired
    private PriceRepository priceRepository;

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public Price getPriceByArtId(String artId) {
        Optional<Price> priceOptional = priceRepository.findById(artId);
        return priceOptional.orElse(null);
    }

    public Price createPrice(Price price) {
        return priceRepository.save(price);
    }

    public Price updatePrice(String artId, Price price) {
        Optional<Price> existingPriceOptional = priceRepository.findById(artId);
        if (existingPriceOptional.isPresent()) {
            Price existingPrice = existingPriceOptional.get();
            existingPrice.setPrice(price.getPrice());
            return priceRepository.save(existingPrice);
        } else {
            return null;
        }
    }

    public void deletePrice(String artId) {
        priceRepository.deleteById(artId);
    }

}
