package com.example.demoExamen.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_materias")
public class Materias {

    @Id
    @Column(name = "id_t_materias")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_t_materias;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "activo")
    private boolean activo;

    public Materias() {
        super();
    }

    public Materias(String nombre, boolean activo) {
        super();
        this.nombre = nombre;
        this.activo = activo;
    }

    public long getId_t_materias() {
        return id_t_materias;
    }

    public void setId_t_materias(long id_t_materias) {
        this.id_t_materias = id_t_materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
