package com.example.demoExamen.repository;

import java.util.List;

import com.example.demoExamen.entity.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EstudianteRepository extends JpaRepository<Alumnos, Long>{

}
