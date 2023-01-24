package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
	@Override
	public void run(String... args) throws Exception {
		//CREACION DEL HOTEL
		Hotel hotel = new Hotel();
		hotel.setDireccion("Quito Sur");
		hotel.setNombre("Vista Hermosa");
		//CREACION DE HABITACIONES
		Habitacion habitacion= new Habitacion();
		habitacion.setNumero("01");
		habitacion.setHotel(hotel);
		
		Habitacion habitacion1= new Habitacion();
		habitacion1.setNumero("02");
		habitacion1.setHotel(hotel);
		
		Habitacion habitacion2= new Habitacion();
		habitacion2.setNumero("03");
		habitacion2.setHotel(hotel);
		
		Habitacion habitacion3= new Habitacion();
		habitacion3.setNumero("04");
		habitacion3.setHotel(hotel);
		
		Habitacion habitacion4= new Habitacion();
		habitacion4.setNumero("05");
		habitacion4.setHotel(hotel);
		//LISTA DE HABITACIONES
		List<Habitacion> lista = new ArrayList<>();
		lista.add(habitacion);
		lista.add(habitacion1);
		lista.add(habitacion2);
		lista.add(habitacion3);
		lista.add(habitacion4);
		
		hotel.setHabitaciones(lista);
		//CREAR HOTEL
		this.hotelService.crear(hotel);
		//EDITAR HOTEL
		hotel.setNombre("Vista Fea");
		Habitacion habitacion5= new Habitacion();
		habitacion5.setNumero("06");
		habitacion5.setHotel(hotel);
		lista.add(habitacion5);
		this.hotelService.editar(hotel);
		//BUSCAR HOTEL
		System.out.println("*********************************\nSe eliminara el siguiente hotel:\n"+ this.hotelService.encontrar(1).toString()
				+"\n********************************");
		//ELIMINAR HOTEL			
		this.hotelService.destruir(1);
		
		

	}

}
