package com.medstory.core.repository;

import java.io.Serializable;
import java.util.List;

import com.medstory.core.enty.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Serializable> {

    public abstract Paciente findByNombre(String nombre);

    public abstract List<Paciente> findByEps(String eps);



}
