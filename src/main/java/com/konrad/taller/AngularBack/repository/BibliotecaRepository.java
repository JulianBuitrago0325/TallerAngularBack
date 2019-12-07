package com.konrad.taller.AngularBack.repository;

import com.konrad.taller.AngularBack.model.BibliotecaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<BibliotecaModel, Integer> {
}
