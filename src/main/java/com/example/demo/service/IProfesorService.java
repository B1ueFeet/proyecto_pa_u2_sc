package com.example.demo.service;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {

	// CRUD BASICO SIEMPRE POR PK
	public void ingresar(Profesor profesor);

	public void modificar(Profesor profesor);

	public Profesor buscar(Integer id);

	public void borrar(Integer id);

}
