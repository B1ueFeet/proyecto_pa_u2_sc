package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.manager.persist(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.manager.merge(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.manager.find(Vehiculo.class, id);
		vehiculo.getClientes().size();
		return vehiculo;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

}
