package com.tt1.test;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    @Test
    void test_id() {
        ToDo todo = new ToDo();
        int n = 0;

        n = 1;
        todo.setId(1);
        assertEquals(1, todo.getId());

        Integer k = 1;
        todo.setId(k);
        assertEquals(k, todo.getId());

        n = 0;
        todo.setId(n);
        assertEquals(n, todo.getId());

        n = -1;
        todo.setId(n);
        assertEquals(n, todo.getId());


        n = 380_912_290;
        todo.setId(n);
        assertEquals(n, todo.getId());
    }

    @Test
    void setNombre() {
        ToDo todo = new ToDo();
        String s = "";

        todo.setNombre(s);
        assertEquals(s, todo.getNombre());

        s = "\n";
        todo.setNombre(s);
        assertEquals(s, todo.getNombre());


        s = "mi super nombre";
        todo.setNombre(s);
        assertEquals(s, todo.getNombre());

        s = "     mi super nombre";
        todo.setNombre(s);
        assertEquals(s, todo.getNombre());


        todo.setNombre("           hola mundo        ");
        assertEquals("           hola mundo        ", todo.getNombre());
        assertNotEquals("hola mundo", todo.getNombre());
    }

    @Test
    void test_nombreNoASCII() {
        ToDo todo = new ToDo();

        String non = "ñèá@ſ€¶ð¢€→@ĸ¢";
        todo.setNombre(non);
        assertEquals(non, todo.getNombre());
    }

    @Test
    void test_descripcion() {
        ToDo todo = new ToDo();
        String s = "";

        todo.setDescripcion(s);
        assertEquals(s, todo.getDescripcion());

        s = "\n";
        todo.setDescripcion(s);
        assertEquals(s, todo.getDescripcion());


        s = "mi super nombre";
        todo.setDescripcion(s);
        assertEquals(s, todo.getDescripcion());

        s = "     mi super nombre";
        todo.setDescripcion(s);
        assertEquals(s, todo.getDescripcion());


        todo.setDescripcion("           hola mundo        ");
        assertEquals("           hola mundo        ", todo.getDescripcion());
        assertNotEquals("hola mundo", todo.getDescripcion());
    }

    @Test
    void test_descripcionNoASCII() {
        ToDo todo = new ToDo();

        String non = "ñèá@ſ€¶ð¢€→@ĸ¢";
        todo.setDescripcion(non);
        assertEquals(non, todo.getDescripcion());
    }

    @Test
    void test_fechaLimite() {
        ToDo todo = new ToDo();

        Date d;
        d = new Date(1L);

        long[] longs = {1L, 2L, -5L, System.currentTimeMillis()};

        for (int i = 0; i < longs.length; i++) {
            d = new Date(longs[i]);
            todo.setFechaLimite(d);
            assertEquals(d, todo.getFechaLimite());
        }
    }
}