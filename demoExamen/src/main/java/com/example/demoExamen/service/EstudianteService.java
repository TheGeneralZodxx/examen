package com.example.demoExamen.service;

import com.example.demoExamen.Model.CalificacionesPorAlumno;
import com.example.demoExamen.Model.CalificacionesPorAlumnoPromedio;
import com.example.demoExamen.Model.DatosAlumnosCalificacion;
import com.example.demoExamen.entity.Alumnos;
import com.example.demoExamen.entity.Calificacion;
import com.example.demoExamen.repository.CalificacionRepository;
import com.example.demoExamen.repository.EstudianteRepository;
import com.example.demoExamen.repository.MateriasRepository;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private MateriasRepository materiasRepository;

    @Autowired
    private CalificacionRepository calificacionRepository;


    public List<Alumnos> findAll() {

        return estudianteRepository.findAll();

    }

    public void agregar(Alumnos alumno) {

        estudianteRepository.save(alumno);

    }

    public void agregarCalificacion(CalificacionesPorAlumno calificacionesPorAlumno) {

        Calificacion ca = new Calificacion();
        ca.setCalificacion(calificacionesPorAlumno.getCalificacion());
        ca.setFecha_registro(new Date());
        ca.setMaterias(materiasRepository.getById(calificacionesPorAlumno.getId_t_materias()));
        ca.setId_t_usuarios(estudianteRepository.getById(calificacionesPorAlumno.getId_t_usuarios()).getId_t_usuarios());

        calificacionRepository.save(ca);

    }

    public CalificacionesPorAlumnoPromedio buscarAlumno(Long id_alumno) {


        List<Calificacion> calificacionList = calificacionRepository.findByIdCalificacion(id_alumno);

        Alumnos alumnos = estudianteRepository.getById(id_alumno);

        List<Double> calificaciones = new ArrayList<>();

        List<DatosAlumnosCalificacion> datosAlumnosCalificacionList = new ArrayList<>();

        for(Calificacion calificacion: calificacionList){

            calificaciones.add(calificacion.getCalificacion());

            DatosAlumnosCalificacion datosAlumnosCalificacion = new DatosAlumnosCalificacion();

            datosAlumnosCalificacion.setCalificacion(calificacion.getCalificacion());
            datosAlumnosCalificacion.setFecha_registro(calificacion.getFecha_registro());
            datosAlumnosCalificacion.setMateria(calificacion.getMaterias().getNombre());
            datosAlumnosCalificacion.setId_t_usuario(id_alumno);
            datosAlumnosCalificacion.setNombre(alumnos.getNombre());
            datosAlumnosCalificacion.setApellido(alumnos.getAp_paterno().concat(" ").concat(alumnos.getAp_materno()));
            datosAlumnosCalificacion.setId_t_calificacion(calificacion.getId_t_calificaciones());

            datosAlumnosCalificacionList.add(datosAlumnosCalificacion);

        }

        Double promedioFinal = calificaciones.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        return new CalificacionesPorAlumnoPromedio(datosAlumnosCalificacionList,promedioFinal);


    }

    public void modificarCalificacion(CalificacionesPorAlumno calificacionesPorAlumno,Long id_calificacion) {

        Calificacion calificacion = calificacionRepository.getById(id_calificacion);

        calificacion.setCalificacion(calificacionesPorAlumno.getCalificacion());
        calificacion.setId_t_calificaciones(id_calificacion);
        calificacion.setMaterias(materiasRepository.getById(calificacionesPorAlumno.getId_t_materias()));
        calificacion.setFecha_registro(calificacionesPorAlumno.getFecha_registro());
        calificacion.setId_t_usuarios(calificacionesPorAlumno.getId_t_usuarios());

        calificacionRepository.save(calificacion);

    }

    public void borrarCalificacion(Long id_calificacion) {

        calificacionRepository.delete(calificacionRepository.getReferenceById(id_calificacion));

    }
}
