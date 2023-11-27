package org.example.entity;

import java.util.Date;

public class Orden {

    private int id_orden;

    private String descripcion_orden;

    private float costo;

    private Date fecha_orden;

    private Cliente cliente;


    // SETTERS Y GETTERS

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public String getDescripcion_orden() {
        return descripcion_orden;
    }

    public void setDescripcion_orden(String descripcion_orden) {
        this.descripcion_orden = descripcion_orden;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Date getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(Date fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    // CONSTRUCTOR VACIO
    public Orden() {
    }


    // CONSTRUCTOR SIN OBJETO CLIENTE
    public Orden(int id_orden, String descripcion_orden, float costo, Date fecha_orden) {
        this.id_orden = id_orden;
        this.descripcion_orden = descripcion_orden;
        this.costo = costo;
        this.fecha_orden = fecha_orden;
    }


    // CONSTRUCTOR COMPLETO
    public Orden(int id_orden, String descripcion_orden, float costo, Date fecha_orden, Cliente cliente) {
        this.id_orden = id_orden;
        this.descripcion_orden = descripcion_orden;
        this.costo = costo;
        this.fecha_orden = fecha_orden;
        this.cliente = cliente;
    }


}
