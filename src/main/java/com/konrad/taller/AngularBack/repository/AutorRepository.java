package com.konrad.taller.AngularBack.repository;

import com.konrad.taller.AngularBack.model.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Integer> {
}
