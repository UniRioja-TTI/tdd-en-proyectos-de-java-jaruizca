package com.tt1.test;

import java.util.List;

public class Repositorio implements IRepositorio {
    private final IDB db;

    public Repositorio(IDB db) {
        this.db = db;
    }

    public ToDo obtenerTodo(Integer i) {
        return db.getTodo(i);
    }

    public void marcarToDoComoCompletado(Integer i) {
        ToDo todo = db.getTodo(i);
        todo.setCompletado(true);
        db.updateTodo(i, todo);
    }

    public void guardarTodo(ToDo todo) {
        db.createTodo(todo);
    }

    public void guardarEmail(String email) {
        db.createEmail(email);
    }

    @Override
    public List<String> obtenerEmails() {
        return db.getEmails();
    }
}