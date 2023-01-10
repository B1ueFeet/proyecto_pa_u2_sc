package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.uce.modelo.Estudiante;

@Service
public class EstudianteServiceImpl	 implements IEstudianteService {
	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void crear(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(id);
	}

}
