package com.kodlamaiorentalService.invertoryServiceClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kodlamaio.invertoryService.business.responses.get.GetAllCarsResponse;

import feign.Headers;

@FeignClient(value ="invertory-service",url = "http://localhost:9011/invertory-service/api/cars/")
public interface InvertoryServiceClient {

	@RequestMapping(method =RequestMethod.GET,value ="getById/{carId}")
	@Headers(value = "Content-Type: application/json")
	GetAllCarsResponse getByCarId(@PathVariable String carId);
}
