package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class AutorRepoImpl implements IAutorRepo{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.manager.persist(autor);
	}

}
