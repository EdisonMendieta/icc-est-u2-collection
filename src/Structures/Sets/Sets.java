package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet();
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
}
