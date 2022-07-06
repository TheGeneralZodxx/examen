package com.example.demoExamen.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_calificaciones")
public class Calificacion {

    @Id
    @Column(name = "id_t_calificaciones")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_t_calificaciones;

    @ManyToOne
    @JoinColumn(name="id_t_materias")
    private Materias materias;

    @Column(name = "id_t_usuarios")
    private Long id_t_usuarios;

    @Column(name = "calificacion")
    private Double calificacion;

    @Column(name = "fecha_registro")
    private Date fecha_registro;

    public Calificacion() {
        super();
    }

    public Calificacion(Materias materias,Long id_t_usuarios,Double calificacion,Date fecha_registro) {
        super();
        this.materias = materias;
        this.id_t_usuarios = id_t_usuarios;
        this.calificacion = calificacion;
        this.fecha_registro = fecha_registro;
    }

    public Long getId_t_calificaciones() {
        return id_t_calificaciones;
    }

    public void setId_t_calificaciones(Long id_t_calificaciones) {
        this.id_t_calificaciones = id_t_calificaciones;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
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
