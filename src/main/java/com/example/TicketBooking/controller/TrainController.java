package com.example.TicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TicketBooking.model.Train;
import com.example.TicketBooking.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {


	    @Autowired
	    private TrainService trainService;

	    @GetMapping
	    public List<Train> getAllTrains() {
	        return trainService.getAllTrains();
	    }

	    @GetMapping("/{id}")
	    public Train getTrainById(@PathVariable Long id) {
	        return trainService.getTrainById(id);
	    }

	    @PostMapping
	    public Train createTrain(@RequestBody Train train) {
	        return trainService.createTrain(train);
	    }

	    @PutMapping("/{id}")
	    public Train updateTrain(@PathVariable Long id, @RequestBody Train updatedTrain) {
	        return trainService.updateTrain(id, updatedTrain);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteTrain(@PathVariable Long id) {
	        trainService.deleteTrain(id);
	    }
	}

