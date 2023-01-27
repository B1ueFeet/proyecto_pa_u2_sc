package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	@Id
	@GeneratedValue(generator = "fact_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "fact_seq", allocationSize = 1, sequenceName = "fact_seq")
	@Column(name = "fact_id")
	private Integer id;
	@Column(name = "fact_numero")
	private String numero;
	@Column(name = "fact_cliente")
	private String cliente;
	
	@OneToMany(mappedBy = "factura")
	private List<Detalle> detalle;
	
	//TO STRING
	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", cliente=" + cliente + "]";
	}
	
	//GETTER & SETTER

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Detalle> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<Detalle> detalle) {
		this.detalle = detalle;
	}
	
	
	
	
}
