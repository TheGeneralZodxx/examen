package com.example.demoExamen.Model;

import java.util.List;

public class CalificacionesPorAlumnoPromedio {

    private List<DatosAlumnosCalificacion> datosAlumnosCalificacionList;
    private Double promedio;

    public CalificacionesPorAlumnoPromedio(List<DatosAlumnosCalificacion> datosAlumnosCalificacionList, Double promedio) {
        this.datosAlumnosCalificacionList = datosAlumnosCalificacionList;
        this.promedio = promedio;
    }

    public List<DatosAlumnosCalificacion> getDatosAlumnosCalificacionList() {
        return datosAlumnosCalificacionList;
    }

    public void setDatosAlumnosCalificacionList(List<DatosAlumnosCalificacion> datosAlumnosCalificacionList) {
        this.datosAlumnosCalificacionList = datosAlumnosCalificacionList;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
