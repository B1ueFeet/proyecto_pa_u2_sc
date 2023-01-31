package com.example.demo.uce.modelo;

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
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(generator = "libr_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "libr_seq", sequenceName = "libr_seq")
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_nombre")
	private String nombre;
	@Column(name = "libr_editorial")
	private String editorial;

	// PRINCIPAL
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor", 							//nombre Tabla rompimiento
	joinColumns = @JoinColumn(name = "liau_id_libro"),			//fk de libro
	inverseJoinColumns = @JoinColumn(name = "liau_id_autor"))	//fk de autor
	private Set<Autor> autores;

	// TO STRING
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + "]";
	}

	// GETTER & SETTER
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

}
