package com.tt1.test;

import java.util.Map;

public class IDBStub implements IDB {
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
}
