package com.konrad.taller.AngularBack.service;

import com.konrad.taller.AngularBack.model.BibliotecaModel;
import com.konrad.taller.AngularBack.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public List<BibliotecaModel> obtenerTodos() {
        return bibliotecaRepository.findAll();
    }

    public BibliotecaModel obtenerPorId(Integer id) {
        return bibliotecaRepository.getOne(id);
    }

    public void crear(BibliotecaModel biblioteca) {
        bibliotecaRepository.save(biblioteca);
    }

    public void actualizar(BibliotecaModel biblioteca) {
        bibliotecaRepository.saveAndFlush(biblioteca);
    }

    public void eliminar(Integer id) {
        bibliotecaRepository.deleteById(id);
    }
}
