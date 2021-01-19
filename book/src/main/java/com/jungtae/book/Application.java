package com.jungtae.book;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.jungtae.book.component.BookingComponent;
import com.jungtae.book.entity.BookingRecord;
import com.jungtae.book.entity.Inventory;
import com.jungtae.book.entity.Passenger;
import com.jungtae.book.repository.InventoryRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableDiscoveryClient 
@SpringBootApplication
@EnableSwagger2
public class Application implements CommandLineRunner{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
 	
	@Autowired
	private BookingComponent bookingComponent;
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		
		Inventory[] invs = { 
					new Inventory("BF100", "22-JAN-18", 100),
					new Inventory("BF101", "22-JAN-18", 100),
					new Inventory("BF102", "22-JAN-18", 100),
					new Inventory("BF103", "22-JAN-18", 100),
					new Inventory("BF104", "22-JAN-18", 100),
					new Inventory("BF105", "22-JAN-18", 100),
					new Inventory("BF106", "22-JAN-18", 100),
					new Inventory("BF107","22-JAN-18", 100),
					new Inventory("BF108","22-JAN-18", 100),
					new Inventory("BF109","22-JAN-18", 109),
					new Inventory("BF110","22-JAN-18", 110),
					new Inventory("BF111","22-JAN-18", 111),
					new Inventory("BF112","22-JAN-18", 112),
					new Inventory("BF113","22-JAN-18", 113),
					new Inventory("BF114","22-JAN-18", 114),
					new Inventory("BF115","22-JAN-18", 115),
					new Inventory("BF116","22-JAN-18", 116),
					new Inventory("BF117","22-JAN-18", 117),
					new Inventory("BF118","22-JAN-18", 118),
					new Inventory("BF119","22-JAN-18", 119),
					new Inventory("BF120","22-JAN-18", 120),
					new Inventory("BF121","22-JAN-18", 121),
					new Inventory("BF122","22-JAN-18", 122),
					new Inventory("BF123","22-JAN-18", 123),
					new Inventory("BF124","22-JAN-18", 124),
					new Inventory("BF125","22-JAN-18", 125),
					new Inventory("BF126","22-JAN-18", 126),
					new Inventory("BF127","22-JAN-18", 127)};
		Arrays.asList(invs).forEach(inventory -> inventoryRepository.save(inventory));
				
		 
		
		BookingRecord booking = new BookingRecord("BF101", "NYC","SFO","22-JAN-18",new Date(),"101");
		Set<Passenger> passengers = new HashSet<Passenger>();
		passengers.add(new Passenger("Gean","Franc","Male", booking));
 
		booking.setPassengers(passengers);
 		long record  = bookingComponent.book(booking);
		logger.info("Booking successfully saved..." + record);
		
		logger.info("Looking to load booking record..."); 
	    logger.info("Result: " + bookingComponent.getBooking(record));
 
	    
	}
	
}
