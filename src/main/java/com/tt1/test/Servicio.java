package com.tt1.test;

public class Servicio {
    private IMailer mailer;
    private IRepositorio repositorio;

    public Servicio(IMailer mailer, IRepositorio repositorio) {
        this.mailer = mailer;
        this.repositorio = repositorio;
    }

    public crearTodo(String nombre, Date fechaLimite) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public agregarEmailAgenda(String email) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public finalizarTodo(String nombre) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    public List<ToDo> obtenerTareasPendientes() {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }
}