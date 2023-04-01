package com.udacity.pricing.microservice;

import com.udacity.pricing.domain.price.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepositoryNew extends CrudRepository<Price,Long> {
}
