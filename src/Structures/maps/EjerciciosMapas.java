package Structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EjerciciosMapas {

    public Map<Integer,Integer> contarDublicados(List<Integer> lista){
        Map<Integer,Integer> conteo = new HashMap<>();

        for (Integer numero : lista) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);

        }
        return conteo;
    }
    
    public Integer primerNoRepetido(List<Integer> lista){
        Map<Integer,Integer> conteo = new HashMap<>();

        for (Integer numero : lista) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);

        }
        for (Integer key : conteo.keySet()) {
            if(conteo.get(key) == 1){
                return key;
            }
        }

        return null;

    }

    public void RankingPuntajes(List<String[]> entradas){
        Map<String,Integer> puntajes = new HashMap<>();

        for (String[] entrada : entradas) {
            String nombre = entrada[0];
            int puntaje = Integer.parseInt(entrada[1]);
            

            puntajes.put(nombre, Math.max(puntajes.getOrDefault(nombre, 0), puntaje));
        }

        for (String key: puntajes.keySet()) {
            System.out.println(key + " -> " + puntajes.get(key));
        }
        
    }

    public void notaMasAltaCarreras(Map<String, Integer> datos){
        Map<String, Integer> nota = new HashMap<>();
        for (String key : datos.keySet()) {
            String carrera = key.split("-")[0];
            nota.put(carrera, Math.max(nota.getOrDefault(carrera, 0),datos.get(key) ));
        } 

        for (String key : nota.keySet()) {
            System.out.println(key + " -> " + nota.get(key));
        }

    }



}
