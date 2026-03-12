package com.tt1.test;

import java.util.*;

/**
 * Simulación funcional de una BD
 */
public class DBStub implements IDB {
    private Map<Integer,ToDo> tablaTodos;
    private Map<Integer,String> agenda;

    private int mayorIdAgenda;

    public DBStub() {
        this.tablaTodos = new HashMap<>();
        this.agenda = new HashMap<>();
        this.mayorIdAgenda = 0;
    }

    @Override
    public ToDo getTodo(Integer id) {
        return tablaTodos.get(id);
    }

    @Override
    public void updateTodo(Integer id, ToDo todo) {
        this.tablaTodos.put(id, todo);
    }

    @Override
    public void deleteTodo(Integer id) {
        this.tablaTodos.remove(id);
    }

    @Override
    public Integer createTodo(ToDo todo) {
        this.tablaTodos.put(todo.getId(), todo);
        return todo.getId();
    }

    @Override
    public List<ToDo> getTodos() {
        return new ArrayList<>(this.tablaTodos.values());
    }

    // Email
    @Override
    public List<String> getEmails() {
        return new ArrayList<>(this.agenda.values());
    }

    @Override
    public String getEmail(Integer id) {
        return agenda.get(id);
    }

    @Override
    public void updateEmail(Integer id, String email) {
        agenda.put(id, email);
    }

    @Override
    public void deleteEmail(Integer id) {
        agenda.remove(id);
    }

    @Override
    public Integer createEmail(String email ) {
        mayorIdAgenda++;
        agenda.put(mayorIdAgenda, email);
        return mayorIdAgenda;
    }
}