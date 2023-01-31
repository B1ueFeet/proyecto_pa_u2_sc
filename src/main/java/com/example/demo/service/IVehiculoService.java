package com.example.demo.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoService {
	
	
	//CRUD
	
	public void guardar (Vehiculo vehiculo);
	public void editar (Vehiculo vehiculo);
	public Vehiculo encontrar (Integer id);
	public void remover (Integer id);

}
