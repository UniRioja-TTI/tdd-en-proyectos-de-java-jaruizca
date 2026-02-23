package com.tt1.test;

public interface IDB {
    ToDo getTodo(Integer id);
    void updateTodo(Integer id, ToDo todo);
    void deleteTodo(Integer id);
    Integer createTodo(ToDo todo);
}
