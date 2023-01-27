package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "detalle")
public class Detalle {
	@Id
	@GeneratedValue(generator = "deta_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "deta_seq", allocationSize = 1, sequenceName = "deta_seq")
	@Column(name = "deta_id")
	private Integer id;
	@Column(name = "deta_nombre")
	private String nombre;
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	@Column(name = "deta_precio")
	private BigDecimal precio;
	@ManyToOne
	@JoinColumn(name = "deta_id_factura")
	private Factura factura;
	
	//TO STRING
	@Override
	public String toString() {
		return "Detalle [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	//GETTER & SETTER
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	
	

}
