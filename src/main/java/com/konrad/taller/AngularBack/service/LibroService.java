package com.konrad.taller.AngularBack.service;

import com.konrad.taller.AngularBack.model.LibroModel;
import com.konrad.taller.AngularBack.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<LibroModel> obtenerTodos() {
        return libroRepository.findAll();
    }

    public LibroModel obtenerPorId(Integer id) {
        return libroRepository.getOne(id);
    }

    public void crear(LibroModel libro) {
        libroRepository.save(libro);
    }

    public void actualizar(LibroModel libro) {
        libroRepository.saveAndFlush(libro);
    }

    public void eliminar(Integer id) {
        libroRepository.deleteById(id);
    }
}
