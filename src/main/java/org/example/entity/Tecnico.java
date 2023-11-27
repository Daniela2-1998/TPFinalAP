package org.example.entity;

public class Tecnico {

    private int id_tecnico;

    private String nombreApellido;


    // SETTERS Y GETTERS
    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }



    // CONSTRUCTOR VACIO
    public Tecnico() {
    }


    // CONSTRUCTOR COMPLETO
    public Tecnico(int id_tecnico, String nombreApellido) {
        this.id_tecnico = id_tecnico;
        this.nombreApellido = nombreApellido;
    }

}
