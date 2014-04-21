package com.jc.model;

/**
 *
 * @author DiiegOO
 */
public class UsuarioLives {
    private int id;
    private String nombre;
    private int edad;
    private String password;

    public UsuarioLives(int id, String nombre, int edad, String password) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
