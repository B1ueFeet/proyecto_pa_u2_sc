package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.manager.persist(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.manager.merge(factura);
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		Factura factura = this.manager.find(Factura.class, id);
		factura.getDetalle().size();
		return factura;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

}
