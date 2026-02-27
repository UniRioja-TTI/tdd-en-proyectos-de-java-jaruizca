package com.tt1.test.muck;

import com.tt1.test.IDB;
import com.tt1.test.ToDo;

import java.util.List;

public class DBFake implements IDB {

    @Override
    public ToDo getTodo(Integer id) {
        return null;
    }

    @Override
    public void updateTodo(Integer id, ToDo todo) {

    }

    @Override
    public void deleteTodo(Integer id) {

    }

    @Override
    public Integer createTodo(ToDo todo) {
        return 1;
    }

    @Override
    public List<ToDo> getTodos() {
        ToDo t = new ToDo();
        t.setNombre("Paco");
        t.setId(1);
        t.setCompletado(true);
        return List.of(t);
    }

    @Override
    public List<String> getEmails() {
        return List.of("mymail@email.com");
    }

    @Override
    public String getEmail(Integer id) {
        return "mymail@email.com";
    }

    @Override
    public void updateEmail(Integer id, String email) { }

    @Override
    public void deleteEmail(Integer id) { }

    @Override
    public Integer createEmail(String email) {
        return 0;
    }
}
