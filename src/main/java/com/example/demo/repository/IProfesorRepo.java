package com.example.demo.repository;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepo {

	// CRUD BASICO SIEMPRE POR PK
	public void insertar(Profesor profesor);

	public void actualizar(Profesor profesor);

	public Profesor buscar(Integer id);

	public void eliminar(Integer id);
}
