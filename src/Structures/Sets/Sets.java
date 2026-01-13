package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Persona;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("G");
        hashSet.add("H");
        hashSet.add("I");
        hashSet.add("J");
        hashSet.add("K");

        return hashSet;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> hashSet = new LinkedHashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("G");
        hashSet.add("H");
        hashSet.add("I");
        hashSet.add("J");
        hashSet.add("K");

        return hashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> hashSet = new TreeSet<>();

        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("I");
        hashSet.add("O");
        hashSet.add("B");
        hashSet.add("a");       
        return hashSet;
    }

    public Set<String> construirTreeSetComparador(){
        Set<String> hashSet = new TreeSet<>(
            (pal1,pal2) -> pal1.compareToIgnoreCase(pal2));
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("I");
        hashSet.add("O");
        hashSet.add("B");
        hashSet.add("a");       

        return hashSet;
    }

    public Set<Persona> personaTreeSet() {
        Set<Persona> treePersona = new TreeSet<>();
            //(pal1,pal2) -> {

                //Solo edad 
                // int com = Integer.compare(pal1.getEdad(), pal2.getEdad());
                // return com;

                //solo nombre
                // return pal2.getNombre().compareToIgnoreCase(pal1.getNombre()); 
                
                //Comparo edad si son iguales los nombres
                //int com = pal2.getNombre().compareToIgnoreCase(pal1.getNombre());
                //if (com == 0) {
                //    return Integer.compare(pal2.getEdad(), pal1.getEdad());
                //}                
                //return com;
                
            //});

        treePersona.add(new Persona("Carlos",23));
        treePersona.add(new Persona("Ana",30));
        treePersona.add(new Persona("Luis",18));
        treePersona.add(new Persona("Ana",20));
        treePersona.add(new Persona("Andres",23));
        treePersona.add(new Persona("Luis",18));

        return treePersona;
    }
}
