package com.example.demo.service;

import com.example.demo.uce.modelo.Alumno;

public interface IAlumnoService {

	// CRUD

	public void inscribir(Alumno alumno);

	public void editar(Alumno alumno);

	public Alumno encontrar(Integer id);

	public void remover(Integer id);

}
