package com.medstory.core.enty;

import javax.persistence.*;
import java.io.Serializable;


@Table(name="PACIENTE")

@Entity
public class Paciente implements Serializable {

    public Paciente() {
    }

    public Paciente(Long id, String nombre, String EPS, String feNa, String cedula, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.EPS = EPS;
        this.feNa = feNa;
        this.cedula = cedula;
        this.clasificacion = clasificacion;
    }

    @GeneratedValue
    @Id
    @Column(name="ID_PACIENTE")
    private Long id;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="EPS")

    private String EPS;

    @Column(name="FENA")

    private String feNa;

    @Column(name="CEDULA")

    private String cedula;

    @Column(name="CLASIFICACION")

    private String clasificacion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getFeNa() {
        return feNa;
    }

    public void setFeNa(String feNa) {
        this.feNa = feNa;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
