package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IAlumnoService;
import com.example.demo.uce.modelo.Alumno;
import com.example.demo.uce.modelo.Contacto;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Autowired
	private IAlumnoService alumnoService;

	@Override
	public void run(String... args) throws Exception {

		Alumno alumno = new Alumno();
		alumno.setApellido("Garcia");
		alumno.setEdad("12");
		alumno.setNombre("Serghy");

		Contacto contacto = new Contacto();
		contacto.setEmail("socastillo@uce.edu.ec");
		contacto.setTelefono("023021832");
		contacto.setAlumno(alumno);

		alumno.setContacto(contacto);

		this.alumnoService.inscribir(alumno);
	}

}
