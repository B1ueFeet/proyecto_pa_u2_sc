package com.example.demo.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	// CRUD BASICO SIEMPRE POR PK
	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscar(Integer id);

	public void eliminar(Integer id);

}
