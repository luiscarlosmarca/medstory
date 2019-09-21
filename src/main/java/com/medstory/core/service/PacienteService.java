package com.medstory.core.service;


import com.medstory.core.converter.Convertidor;
import com.medstory.core.enty.Paciente;
import com.medstory.core.model.PacienteModel;
import com.medstory.core.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("servicio");
public class PacienteService {

    @Autowired
    @Qualifier("respositorio")
    private PacienteRepository repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(Paciente paciente){

        try {

            repositorio.save(paciente);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public boolean actualizar(Paciente paciente){

        try {
            repositorio.save(paciente);

            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean borrar(String nombre, long id){

        try {
        Paciente paciente= repositorio.findByNombreAndId(nombre,id);
        repositorio.delete(paciente);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<PacienteModel> obtener(){

       return convertidor.convertirLista(repositorio.findAll();
    }

}
