package com.uco.hackathon;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//TODO Clase de prueba para guardar la entidad
@Entity
@Table
public class Torneo {

    @Column
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    @Column
    private String nombre;
    @Column
    private String ubicacion;
    @Column
    private String deporte;
    @Column
    private String descripcion;
    public  Torneo(Integer id, String nombre, String ubicacion, String deporte, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.descripcion = descripcion;
    }

    public  Torneo() {

    }
}


