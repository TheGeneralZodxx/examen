package com.example.demoExamen.repository;

import com.example.demoExamen.entity.Alumnos;
import com.example.demoExamen.entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CalificacionRepository extends JpaRepository<Calificacion, Long>{


    @Query("select c from Calificacion c where c.id_t_usuarios= :id_alumno")
    List<Calificacion> findByIdCalificacion(@Param("id_alumno") Long id_alumno);

}
