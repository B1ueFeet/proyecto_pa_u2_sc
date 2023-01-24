package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {
	@Autowired
	private IEmpleadoService empleadoService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//NOMBRES APELLIDOS Y SALARIO RANDOMICOS
		/*Random rd = new Random();
		List<String> nombres = new ArrayList<>();
		nombres.add("Serghy");
		nombres.add("Omar");
		nombres.add("Edison");
		nombres.add("Maria");
		nombres.add("Monica");
		nombres.add("Dario");

		List<String> apellidos = new ArrayList<>();
		apellidos.add("Castillo");
		apellidos.add("Cayambe");
		apellidos.add("Conde");
		apellidos.add("Garcia");
		apellidos.add("Maldonado");
		apellidos.add("Muñoz");
		
		//CREATE
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido(this.getRandomElement(apellidos));
		ciudadano.setNombre(this.getRandomElement(nombres));

		Empleado empleado = new Empleado();
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setSalario(new BigDecimal(rd.nextInt(100, 500)));
		empleado.setCiudadano(ciudadano);
		ciudadano.setEmpleado(empleado);	

		this.ciudadanoService.ingresar(ciudadano);
		


		//CREATE
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setApellido(this.getRandomElement(apellidos));
		ciudadano2.setNombre(this.getRandomElement(nombres));

		Empleado empleado2 = new Empleado();
		empleado2.setFechaIngreso(LocalDateTime.now());
		empleado2.setSalario(new BigDecimal(rd.nextInt(100, 500)));
		empleado2.setCiudadano(ciudadano2);
		ciudadano2.setEmpleado(empleado2);	

		this.empleadoService.ingresar(empleado2); */

	}

	private  String getRandomElement(List<String> list) {
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}

}
