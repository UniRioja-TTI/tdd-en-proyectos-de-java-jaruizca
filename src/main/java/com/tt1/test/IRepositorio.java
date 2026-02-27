package com.tt1.test;

import java.util.List;

public interface IRepositorio {
    ToDo obtenerTodo(Integer i);
    void marcarToDoComoCompletado(Integer i);
    void guardarTodo(ToDo todo);
    void guardarEmail(String email);
    List<String> obtenerEmails();
}