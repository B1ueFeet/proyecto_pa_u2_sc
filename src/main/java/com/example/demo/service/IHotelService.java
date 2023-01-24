package com.example.demo.service;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	
	// CRUD
	public void crear(Hotel hotel);

	public void editar(Hotel hotel);

	public Hotel encontrar(Integer id);

	public void destruir(Integer id);

}
