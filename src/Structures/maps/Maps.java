package Structures.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Persona;

public class Maps {
    
    public Map<String,Integer> construirHashMap(){
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);

        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println( hashMap.values().toArray()[i]);
        }

        for (String key : hashMap.keySet()) {
            System.out.println("La lave: " + key + " / el valor : " + hashMap.get(key));
        }
        return hashMap;
        
    }

    public Map<String,Integer> construirLinkedHashMap(){
        Map<String,Integer> linkedhashMap = new HashMap<>();
        linkedhashMap.put("A", 2);
        linkedhashMap.put("B", 3);
        linkedhashMap.put("A", 5);
        linkedhashMap.put("C", 50);
        linkedhashMap.put("D", 5);
        linkedhashMap.put("F", 3);
        linkedhashMap.put("G", 8);
        linkedhashMap.put("H", 85);
        linkedhashMap.put("I", 5);
        linkedhashMap.put("J", 6);
        System.out.println(linkedhashMap.values());
        System.out.println(linkedhashMap.keySet());
        return linkedhashMap;
    }

    public Map<String,Integer> construirTreeMap(){
        Map<String,Integer> treeMaps = new HashMap<>();
        treeMaps.put("B", 2);
        treeMaps.put("C", 3);
        treeMaps.put("A", 5);
        treeMaps.put("D", 50);
        treeMaps.put("F", 5);
        treeMaps.put("A", 3);
        treeMaps.put("G", 8);
        treeMaps.put("J", 85);
        treeMaps.put("I", 5);
        treeMaps.put("H", 6);
        System.out.println(treeMaps);
        return treeMaps;

    }


    public Map<Persona,Integer> construirTreeMapPerson(){
        Map<Persona,Integer> treePerson = new TreeMap<>();
        treePerson.put(new Persona("Carlos", 23), 1000);
        treePerson.put(new Persona("Ana",30), 2000);
        treePerson.put(new Persona("Luis",18), 3000);
        treePerson.put(new Persona("Ana",20), 4000);
        treePerson.put(new Persona("Andres",23), 5000);
        treePerson.put(new Persona("Luis",18), 6000);
        
        return treePerson;
    }

    public Map<Integer, Persona> construirTreeMapPersonq(){
        Map<Integer,Persona> treePerson = new TreeMap<>();
        treePerson.put(11,new Persona("Carlos", 23));
        treePerson.put(9,new Persona("Ana",30));
        treePerson.put(70,new Persona("Luis",18));
        treePerson.put(8,new Persona("Ana",20));
        treePerson.put(7,new Persona("Andres",23));
        treePerson.put(10,new Persona("Luis",18));
        
        return treePerson;
    }

    public Map<Integer, Persona> construirTreeMapPersonObj(){
        List<Persona> list = new ArrayList<>();
        list.add(new Persona("Carlos", 23, 123));
        list.add(new Persona("Ana",30,124));
        list.add(new Persona("Luis",18,125));
        list.add(new Persona("Ana",20,123));
        list.add(new Persona("Andres",23,129));
        list.add(new Persona("Luis",18,124));

        Map<Integer,Persona> treePerson = new TreeMap<>();
        for (Persona persona : list) {
            treePerson.put(persona.getCedula(), persona);
        }

        for (Integer key : treePerson.keySet()) {
            System.out.println(treePerson.get(key));
        }
        
        return treePerson;
    }

    public void printFilter(Map<Persona,Integer> treePerson){
        for (Persona key : treePerson.keySet()) {
            if (key .getEdad()>= 20 && treePerson.get(key) > 2000) {
                System.out.println(key + " - " + treePerson.get(key));
                
            }
        }

    }



}
