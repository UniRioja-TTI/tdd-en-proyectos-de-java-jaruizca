package com.tt1.test;

import java.util.Date;

public class ToDo {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fechaLimite;
    private boolean completado;

    public ToDo() {
        id = 0;
        nombre = "";
        descripcion = "";
        // Fecha límite inicial dentro de 2 semanas
        fechaLimite = new Date(System.currentTimeMillis() + 86400 * 1000 * 14);
        completado = false;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public boolean getCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
