package com.example.demoExamen.repository;

import com.example.demoExamen.entity.Alumnos;
import com.example.demoExamen.entity.Materias;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MateriasRepository extends JpaRepository<Materias, Long>{

}
