package com.example.demo.repository;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	//CRUD
	
	public void insertar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public Vehiculo buscar (Integer id);
	public void eliminar (Integer id);
	

}
