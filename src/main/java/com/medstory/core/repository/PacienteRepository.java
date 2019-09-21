package com.medstory.core.repository;

import java.io.Serializable;
import java.util.List;

import com.medstory.core.enty.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorio")
public interface PacienteRepository extends CrudRepository<Paciente, Serializable> {

    public abstract Paciente findByNombre(String nombre);

    public abstract Paciente findByNombreAndId(String nombre, long id);

    public abstract List<Paciente> findByEps(String eps);



}
