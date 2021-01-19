package com.jungtae.fares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jungtae.fares.entity.Fare;

public interface FaresRepository extends JpaRepository<Fare,Long> {
	Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
