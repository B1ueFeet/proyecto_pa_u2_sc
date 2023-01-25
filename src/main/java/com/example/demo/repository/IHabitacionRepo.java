package com.example.demo.repository;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionRepo {
	
	//CRUD
	// CRUD
	public void insertar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public Habitacion buscar(Integer id);

	public void eliminar(Integer id);

}
