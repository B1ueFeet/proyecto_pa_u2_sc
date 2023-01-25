package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	@Override
	public void run(String... args) throws Exception {
		

		Hotel hotel = this.hotelService.encontrar(1);
		
		
		System.out.println("Hotel: "+ hotel.getNombre());
		hotel.getHabitaciones().forEach(System.out::println);
			
		
		//System.out.println(this.hotelService.encontrar(1).getHabitaciones().get(0).toString());
	
		
		

		
		

	}

}
