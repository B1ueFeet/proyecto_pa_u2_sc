package com.example.demo.repository;

import com.example.demo.uce.modelo.Alumno;

public interface IAlumnoRepo {

	// CRUD

	public void insertar(Alumno alumno);

	public void actualizar(Alumno alumno);

	public Alumno buscar(Integer id);

	public void eliminar(Integer id);

}
