package com.konrad.taller.AngularBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konrad.taller.AngularBack.model.AutorModel;
import com.konrad.taller.AngularBack.repository.AutorRepository;

@Service
public class AutorService {
	@Autowired
	private AutorRepository autorRepository;

	public List<AutorModel> obtenerTodos() {
		return autorRepository.findAll();
	}

	public AutorModel obtenerPorId(Integer id) {
		return autorRepository.getOne(id);
	}

	public void crear(AutorModel autor) {
		autorRepository.save(autor);
	}

	public void actualizar(AutorModel autor) {
		autorRepository.saveAndFlush(autor);
	}

	public void eliminar(Integer id) {
		autorRepository.deleteById(id);
	}
}
