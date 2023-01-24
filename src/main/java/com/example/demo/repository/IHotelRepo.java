package com.example.demo.repository;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelRepo {

	// CRUD
	public void insertar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public Hotel buscar(Integer id);

	public void eliminar(Integer id);

}
