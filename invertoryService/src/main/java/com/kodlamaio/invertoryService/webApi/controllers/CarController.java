package com.kodlamaio.invertoryService.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.invertoryService.business.abstracts.CarService;
import com.kodlamaio.invertoryService.business.requests.create.CreateCarRequest;
import com.kodlamaio.invertoryService.business.requests.delete.DeleteCarRequest;
import com.kodlamaio.invertoryService.business.requests.update.UpdateCarRequest;
import com.kodlamaio.invertoryService.business.responses.create.CreateCarResponse;
import com.kodlamaio.invertoryService.business.responses.get.GetAllCarsResponse;
import com.kodlamaio.invertoryService.business.responses.update.UpdateCarResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {

	private CarService carService;
	
	@GetMapping("getall")
	public List<GetAllCarsResponse> getAll() {
		return carService.getAll();
	}
	
	@GetMapping("/getById/{carId}")
	public GetAllCarsResponse getById(@PathVariable String carId) {
		return carService.getById(carId);
	}
	
	@PostMapping("add")
	public CreateCarResponse add(@RequestBody @Valid CreateCarRequest createCarRequest) {
		return carService.add(createCarRequest);
	}
	
	@PutMapping("update")
	public UpdateCarResponse update(@RequestBody @Valid UpdateCarRequest updateCarRequest) {
		return carService.update(updateCarRequest);
	}
	
	@DeleteMapping("delete")
	public void delete(DeleteCarRequest deleteCarRequest) {
		carService.delete(deleteCarRequest);
	}
	
	
}
