package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IProfesorService;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner{
	@Autowired
	private IProfesorService iProfesorService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Profesor profesor = new Profesor();
		profesor.setApellido("Castillo");
		profesor.setCedula("1717844466");
		profesor.setCiudad("Quito");
		profesor.setGenero("M");
		profesor.setNombre("Serghy");
		profesor.setMateria("Agronomia de la computadora");
		
		this.iProfesorService.ingresar(profesor);
		

	}

}
