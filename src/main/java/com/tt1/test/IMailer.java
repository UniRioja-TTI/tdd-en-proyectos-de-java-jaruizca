package com.tt1.test;

public interface IMailer {
    //
    // correctamente y falso si ha ocurrido algún fallo.

    /**
     * Envía un email con el contenido {@paramref mensaje} al destinatario {@paramref direccion}
     * @param direccion dirección del destinatario del correo electrónico.
     * @param mensaje mensaje que se quiere envíar al destinatario.
     * @return Devuelve true si el email se ha envíado
     */
    boolean enviarEmail(String direccion, String mensaje);
}