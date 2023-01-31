package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(generator = "vehi_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "vehi_seq", sequenceName = "vehi_seq")
	@Column(name = "vehi_id")
	private Integer id;
	@Column(name = "vehi_precio")
	private BigDecimal precio;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name = "vehi_modelo")
	private String modelo;
	@Column(name = "vehi_placa")
	private String placa;
	
	// PRINCIPAL
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vehiculo_cliente", 							
	joinColumns = @JoinColumn(name = "vecl_id_vehiculo"),			
	inverseJoinColumns = @JoinColumn(name = "vecl_id_cliente"))	
	private Set<Cliente> clientes;
	
	//TO STRING
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + ", placa="
				+ placa + "]";
	}
	
	//GETTER & SETTER
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	

}
