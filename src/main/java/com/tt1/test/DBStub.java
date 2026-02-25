package com.tt1.test;

import java.util.Map;

public class DBStub implements IDB {
    private Map<Integer,ToDo> tabla;


    @Override
    public ToDo getTodo(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void updateTodo(Integer id, ToDo todo) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public void deleteTodo(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    public Integer createTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    // Email
    @Override
    List<String> getEmails() {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    String getEmail(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    void updateEmail(Integer id, String email) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    void deleteEmail(Integer id) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }

    @Override
    Integer createEmail(String email ) {
        throw new UnsupportedOperationException("Clase no implementada aún");
    }
}