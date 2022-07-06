package com.example.demoExamen.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatosAlumnosCalificacion {

    private Long id_t_usuario;

    private Long id_t_calificacion;
    private String nombre;
    private String apellido;
    private String materia;
    private Double calificacion;
    private String fecha_registro;

    public DatosAlumnosCalificacion(){

    }

    public DatosAlumnosCalificacion(Long id_t_usuario, String nombre, String apellido, String materia, Double calificacion, String fecha_registro,Long id_t_calificacion) {
        this.id_t_usuario = id_t_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.calificacion = calificacion;
        this.fecha_registro = fecha_registro;
        this.id_t_calificacion = id_t_calificacion;
    }

    public Long getId_t_usuario() {
        return id_t_usuario;
    }

    public void setId_t_usuario(Long id_t_usuario) {
        this.id_t_usuario = id_t_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        if(fecha_registro == null){
            this.fecha_registro = null;
        }else{
            this.fecha_registro = formatter.format(fecha_registro);
        }
    }

    public Long getId_t_calificacion() {
        return id_t_calificacion;
    }

    public void setId_t_calificacion(Long id_t_calificacion) {
        this.id_t_calificacion = id_t_calificacion;
    }
}
