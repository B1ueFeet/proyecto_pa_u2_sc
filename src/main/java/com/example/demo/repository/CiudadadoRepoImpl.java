package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CiudadadoRepoImpl  implements ICiudadanoRepo{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.manager.persist(ciudadano);
	}

}
