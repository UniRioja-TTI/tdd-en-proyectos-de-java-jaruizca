package com.tt1.test;

import java.util.List;

/**
 * Interfaz de conexión a una BD que permite las operaciones CRUD de dos clases: ToDo y Email.
 */
public interface IDB {
    // ToDo

    /**
     * Permite obtener un objeto ToDo
     * @param id identificador del objeto ToDo
     * @return devuelve el objeto ToDo o null si la BD no contiene un ToDo con este identificador.
     */
    ToDo getTodo(Integer id);

    /**
     * Actualiza el valor de un ToDo que yá está almacenado.
     * @param id identificador del objeto que se quiere actualizar
     * @param todo Objeto todo con los datos que se van a sobreescribir.
     */
    void updateTodo(Integer id, ToDo todo);

    /**
     * Elimina un ToDo ya registrado en la DB
     * @param id identificador del elemento que se quiere eliminar.
     */
    void deleteTodo(Integer id);

    /**
     * Registra un nuevo objeto ToDo.
     * @param todo objeto que se quiere almacenar.
     * @return Devuelve el identificador con el que es registrado el objeto.
     */
    Integer createTodo(ToDo todo);


    /**
     * Devuelve todos los objetos ToDo's registrados
'     * @return listado de todos los ToDo's registrados
     */
    List<ToDo> getTodos();

    // Email
    List<String> getEmails();
    String getEmail(Integer id);
    void updateEmail(Integer id, String email);
    void deleteEmail(Integer id);
    Integer createEmail(String email );
}