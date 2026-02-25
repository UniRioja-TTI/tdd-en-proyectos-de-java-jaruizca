package com.tt1.test;

import java.util.Date;
import java.util.List;

public class Servicio {
    private IMailer mailer;
    private IRepositorio repositorio;

    public Servicio(IMailer mailer, IRepositorio repositorio) {
        this.mailer = mailer;
        this.repositorio = repositorio;
    }

    public void crearTodo(String nombre, Date fechaLimite) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public void agregarEmailAgenda(String email) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public void finalizarTodo(String nombre) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public List<ToDo> obtenerTareasPendientes() {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }
}