package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AlumnoRepoImpl implements IAlumnoRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.manager.persist(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.manager.merge(alumno);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.manager.find(Alumno.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

}
