package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IAutorService;
import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Autowired
	private IAutorService autorService;
	
	@Override
	public void run(String... args) throws Exception {

		Autor autor = new Autor();
		Autor autor2 = new Autor();
		Autor autor3 = new Autor();
		Autor autor4 = new Autor();
		
		
		autor.setNombre("WS");
		autor2.setNombre("WY");
		autor3.setNombre("JS");
		autor4.setNombre("OM");
		
		Libro libro = new Libro();
		Libro libro2 = new Libro();
		
		libro.setEditorial("NORMA");
		libro2.setEditorial("Patito");
		
		libro.setNombre("P. Web");
		libro2.setNombre("Redes");
		
		Set<Autor> autores = new HashSet<>();
		Set<Autor> autores2 = new HashSet<>();
		Set<Libro> libros = new HashSet<>();
		Set<Libro> libros2 = new HashSet<>();
		Set<Libro> libros3 = new HashSet<>();
		
		autores.add(autor);
		autores.add(autor4);
		
		autores2.add(autor);
		autores2.add(autor2);
		autores2.add(autor3);
		
		libros.add(libro2);
		
		libros3.add(libro);
		
		libros2.add(libro);
		libros2.add(libro2);
		
		autor.setLibros(libros2);
		
		autor2.setLibros(libros);
		
		autor3.setLibros(libros);
		
		autor4.setLibros(libros3);
		
		libro.setAutores(autores);
		
		libro2.setAutores(autores2);
		
		this.autorService.guardar(autor);

		
		
	}

}
