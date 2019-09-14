package com.medstory.core.model;

import com.medstory.core.enty.Paciente;

public class PacienteModel {

    public PacienteModel(Paciente paciente) {
        this.id = paciente.getId();
        this.nombre = paciente.getNombre();
        this.EPS = paciente.getEPS();
        this.feNa = paciente.getFeNa();
        this.cedula = paciente.getCedula();
        this.clasificacion = paciente.getClasificacion();


    }

    public PacienteModel(Long id, String nombre, String EPS, String feNa, String cedula, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.EPS = EPS;
        this.feNa = feNa;
        this.cedula = cedula;
        this.clasificacion = clasificacion;
    }

    private Long id;

    private String nombre;

    private String EPS;

    private String feNa;

    private String cedula;

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
        this.nombre = nombre;
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
