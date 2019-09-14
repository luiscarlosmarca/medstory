package com.medstory.core.converter;

import com.medstory.core.enty.Paciente;
import com.medstory.core.model.PacienteModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")

public class Convertidor {

    public List<PacienteModel> convertirLista(List <Paciente> pacientes){

        List<PacienteModel> mPaciente= new ArrayList<>();

        for(Paciente paciente: pacientes) {
            mPaciente.add(new PacienteModel(paciente));
        }
            return mPaciente;

    }

}
