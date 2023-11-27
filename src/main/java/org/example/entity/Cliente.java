package org.example.entity;

public class Cliente {

    private int dni;

    private String nombre;

    private String direccion;

    private String mail;




    // GETTERS Y SETTERS
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    // CONSTRUCTOR VACÍO
    public Cliente() {
    }

    // CONSTRUCTOR COMPLETO
    public Cliente(int dni, String nombre, String direccion, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
    }

}
