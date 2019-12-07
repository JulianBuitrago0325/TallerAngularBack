package com.konrad.taller.AngularBack.repository;

import com.konrad.taller.AngularBack.model.LibroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<LibroModel, Integer> {
}
