package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAlumnoRepo;
import com.example.demo.uce.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService{

	
	@Autowired
	private IAlumnoRepo alumnoRepo; 
	
	@Override
	public void inscribir(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepo.insertar(alumno);
	}

	@Override
	public void editar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepo.actualizar(alumno);
	}

	@Override
	public Alumno encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepo.buscar(id);
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepo.eliminar(id);
	}

}
