package org.example.entity;

public class Categoria {

    private int id_categoria;

    private String descripcion_categoria;



    // GETTERS Y SETTERS

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }


    // CONSTRUCTOR VACÍO
    public Categoria() {
    }


    // CONSTRUCTOR COMPLETO
    public Categoria(int id_categoria, String descripcion_categoria) {
        this.id_categoria = id_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }
}
