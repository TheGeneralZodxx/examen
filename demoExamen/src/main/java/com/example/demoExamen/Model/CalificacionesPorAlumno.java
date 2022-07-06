package com.example.demoExamen.Model;

import java.util.Date;

public class CalificacionesPorAlumno {

    private Long id_t_materias;
    private Long id_t_usuarios;
    private Double calificacion;
    private Date fecha_registro;

    public CalificacionesPorAlumno(Long id_t_materias, Long id_t_usuarios, Double calificacion, Date fecha_registro) {
        this.id_t_materias = id_t_materias;
        this.id_t_usuarios = id_t_usuarios;
        this.calificacion = calificacion;
        this.fecha_registro = fecha_registro;
    }

    public Long getId_t_materias() {
        return id_t_materias;
    }

    public void setId_t_materias(Long id_t_materias) {
        this.id_t_materias = id_t_materias;
    }

    public Long getId_t_usuarios() {
        return id_t_usuarios;
    }

    public void setId_t_usuarios(Long id_t_usuarios) {
        this.id_t_usuarios = id_t_usuarios;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
