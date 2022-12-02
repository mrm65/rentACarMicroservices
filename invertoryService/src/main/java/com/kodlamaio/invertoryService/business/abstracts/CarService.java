package com.kodlamaio.invertoryService.business.abstracts;

import java.util.List;

import com.kodlamaio.invertoryService.business.requests.create.CreateCarRequest;
import com.kodlamaio.invertoryService.business.requests.delete.DeleteCarRequest;
import com.kodlamaio.invertoryService.business.requests.update.UpdateCarRequest;
import com.kodlamaio.invertoryService.business.responses.create.CreateCarResponse;
import com.kodlamaio.invertoryService.business.responses.get.GetAllCarsResponse;
import com.kodlamaio.invertoryService.business.responses.update.UpdateCarResponse;

public interface CarService {

	List<GetAllCarsResponse> getAll();
	GetAllCarsResponse getById(String carId);
	CreateCarResponse add(CreateCarRequest createCarRequest);
	UpdateCarResponse update(UpdateCarRequest updateCarRequest);
	void delete(DeleteCarRequest deleteCarRequest);
	void updateCarState(String carId,int state);
}
