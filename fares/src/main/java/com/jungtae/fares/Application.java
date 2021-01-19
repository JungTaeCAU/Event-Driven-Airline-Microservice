package com.jungtae.fares;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.jungtae.fares.entity.Fare;
import com.jungtae.fares.repository.FaresRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient 
@EnableSwagger2 
public class Application implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	FaresRepository faresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Override
	public void run(String... strings) throws Exception {
		Fare[] fares = {
		new Fare("BF100","22-JAN-18", "101"),
		new Fare("BF101","22-JAN-18", "101"),
		new Fare("BF102","22-JAN-18", "102"),
		new Fare("BF103","22-JAN-18", "103"),
		new Fare("BF104","22-JAN-18", "104"),
		new Fare("BF105","22-JAN-18", "105"),
		new Fare("BF106","22-JAN-18", "106"),
		new Fare("BF107","22-JAN-18", "107"),
		new Fare("BF108","22-JAN-18", "108"),
		new Fare("BF109","22-JAN-18", "109"),
		new Fare("BF110","22-JAN-18", "110"),
		new Fare("BF111","22-JAN-18", "111"),
		new Fare("BF112","22-JAN-18", "112"),
		new Fare("BF113","22-JAN-18", "113"),
		new Fare("BF114","22-JAN-18", "114"),
		new Fare("BF115","22-JAN-18", "115"),
		new Fare("BF116","22-JAN-18", "116"),
		new Fare("BF117","22-JAN-18", "117"),
		new Fare("BF118","22-JAN-18", "118"),
		new Fare("BF119","22-JAN-18", "119"),
		new Fare("BF120","22-JAN-18", "120"),
		new Fare("BF121","22-JAN-18", "121"),
		new Fare("BF122","22-JAN-18", "122"),
		new Fare("BF123","22-JAN-18", "123"),
		new Fare("BF124","22-JAN-18", "124"),
		new Fare("BF125","22-JAN-18", "125"),
		new Fare("BF126","22-JAN-18", "126"),
		new Fare("BF127","22-JAN-18", "127")};
		List<Fare> list = Arrays.stream(fares).collect(Collectors.toList());
		list.forEach(fare -> faresRepository.save(fare)); 
			
 		logger.info("Result: " + faresRepository.getFareByFlightNumberAndFlightDate("BF101","22-JAN-18"));
 
	}
	
}
