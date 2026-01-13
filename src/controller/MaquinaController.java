package controller;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {

    private Maquina mauina;
    //Metodo que ordene un lista de maquinas por riesgo mayor a menor
    //Si dos maquinas tienen el mismo riesgo, ordenarlas por subred mayor a menor

    
    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas) {
        Set<Maquina> maquinasOrdenadas = new TreeSet<>();
        for (Maquina maquina : maquinas) {
            maquinasOrdenadas.add(maquina);
            
        }
        return maquinasOrdenadas;
    }

}
