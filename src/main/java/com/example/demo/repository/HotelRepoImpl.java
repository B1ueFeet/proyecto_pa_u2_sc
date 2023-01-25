package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepoImpl implements IHotelRepo{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.manager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.manager.merge(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		Hotel hotel =this.manager.find(Hotel.class, id);
		hotel.getHabitaciones();
		return hotel;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}


	@Override
	public Hotel buscarpesado(Integer id) {
		Hotel hotel =this.manager.find(Hotel.class, id);
		hotel.getHabitaciones().size();
		return hotel;
	}

}
