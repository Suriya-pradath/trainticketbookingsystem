package com.example.TicketBooking.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketBooking.model.Train;

public interface TrainRepository extends JpaRepository<Train, Long> {

	Optional<Train> findById(Long id);
}