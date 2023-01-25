package com.example.demo.service;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {
	
	// CRUD
	public void crear(Habitacion habitacion);

	public void modificar(Habitacion habitacion);

	public Habitacion encontrar(Integer id);

	public void destruir(Integer id);

}
