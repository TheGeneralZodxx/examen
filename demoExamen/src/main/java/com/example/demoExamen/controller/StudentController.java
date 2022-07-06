package com.example.demoExamen.controller;


import com.example.demoExamen.Model.CalificacionesPorAlumno;
import com.example.demoExamen.Model.CalificacionesPorAlumnoPromedio;
import com.example.demoExamen.entity.Alumnos;
import com.example.demoExamen.repository.EstudianteRepository;
import com.example.demoExamen.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;


@Controller
@RequestMapping("/estudiantes/")
public class StudentController {

	@Autowired
	EstudianteService estudianteService;


	@RequestMapping(value="buscarAlumno", method= RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> buscarAlumno(@RequestParam Long id_alumno) {
		try{
			CalificacionesPorAlumnoPromedio calificacionesPorAlumnoPromedio = estudianteService.buscarAlumno(id_alumno);
			return new ResponseEntity<Object>(calificacionesPorAlumnoPromedio, HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al buscar usuario", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="agregarAlumno", method= RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> agregarAlumno(@RequestBody Alumnos alumno) {
		try{
			estudianteService.agregar(alumno);
			return new ResponseEntity<Object>("Calificacion registrada", HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<Object>("Error al registrar calificacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="agregarCalificacion", method= RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> agregarCalificacion(@RequestBody CalificacionesPorAlumno calificacionesPorAlumno) {
		try{
			estudianteService.agregarCalificacion(calificacionesPorAlumno);
			return new ResponseEntity<Object>("Calificacion registrada", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al registrar calificacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="modificarCalificacion", method= RequestMethod.PUT,produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> modificarCalificacion(@RequestBody CalificacionesPorAlumno calificacionesPorAlumno, @RequestParam Long id_calificacion) {
		try{
			estudianteService.modificarCalificacion(calificacionesPorAlumno,id_calificacion);
			return new ResponseEntity<Object>("Calificacion modificada", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al modificar calificacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value="borrarCalificacion", method= RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> borrarCalificacion(@RequestParam Long id_calificacion) {
		try{
			estudianteService.borrarCalificacion(id_calificacion);
			return new ResponseEntity<Object>("Calificacion eliminada", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al eliminar calificacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
