package com.kodlamaio.invertoryService.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kodlamaio.common.events.RentalCreatedEvent;
import com.kodlamaio.invertoryService.business.abstracts.CarService;
import com.kodlamaio.invertoryService.business.requests.update.UpdateCarRequest;
import com.kodlamaio.invertoryService.entities.Car;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RentalConsumer {

	private CarService carService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RentalConsumer.class);

    @KafkaListener
    (
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(RentalCreatedEvent event){
        LOGGER.info(String.format("Order event received in stock service => %s", event.toString()));
       carService.updateCarState(event.getCarId());
    }
   
}
