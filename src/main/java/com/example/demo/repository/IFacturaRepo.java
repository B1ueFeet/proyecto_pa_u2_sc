package com.example.demo.repository;

import com.example.demo.uce.modelo.Factura;

public interface IFacturaRepo {

	public void insertar(Factura factura);

	public void actualizar(Factura factura);

	public Factura buscar(Integer id);

	public void eliminar(Integer id);

}
