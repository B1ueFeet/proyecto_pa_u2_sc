package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.uce.modelo.Profesor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProfesorRepoImpl implements IProfesorRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Profesor profesor) {
		this.manager.persist(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		this.manager.merge(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {

		return this.manager.find(Profesor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.manager.remove(this.manager.find(Profesor.class, id));

	}

}
