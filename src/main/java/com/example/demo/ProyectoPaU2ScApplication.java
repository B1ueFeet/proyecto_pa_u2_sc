package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Castillo");
		estudiante.setCedula("1717844466");
		estudiante.setCiudad("Quito");
		estudiante.setGenero("M");
		estudiante.setNombre("Serghy");
		
		this.estudianteService.crear(estudiante);
		
		
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Castillo");
		ciudadano.setNombre("Serghy");
		
		Empleado empleado = new Empleado();
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setSalario(new BigDecimal(20));
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		
	}

}
