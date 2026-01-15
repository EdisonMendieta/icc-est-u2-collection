import Structures.Sets.Sets;
import Structures.maps.Maps;
import controller.MaquinaController;
import models.Maquina;
import models.Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Sets setsClase = new Sets();
        Set<String> hashSet = setsClase.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        System.out.println("A".hashCode());
        
        /*String a1 = "A";
            String a2 = "A";
            System.out.println(a1.hashCode());
            System.out.println(a2.hashCode());

            Node<String> n1 = new Node<>("A");
            Node<String> n2 = new Node<>("A");
            System.out.println(n1.hashCode());
            System.out.println(n2.hashCode());
            System.out.println(n1.hashCode() == n2.hashCode());
        */

        Set<String> linkedHash = setsClase.construirLinkedHashSet();
        System.out.println(linkedHash);

        Set<String> treeSet = setsClase.construirTreeSet();
        System.out.println(treeSet);

        treeSet = setsClase.construirTreeSetComparador();
        System.out.println(treeSet);

        Set<Persona> treePerson = setsClase.personaTreeSet();
        System.out.println(treePerson);

        System.out.println("Carlos".compareTo("Luis"));
        
        // runMaquina();
        Maps mapas = new Maps();
        System.out.println(mapas.construirHashMap());
        mapas.construirLinkedHashMap();

        Map<Persona,Integer> treeMaps = new HashMap<>(mapas.construirTreeMapPerson());
        System.err.println(treeMaps);
        System.out.println("");
        mapas.printFilter(treeMaps);
        
    }

    private static void runMaquina() {
        List<Maquina> maquinas = crearMaquinas();
        MaquinaController controller = new MaquinaController();
        Set<Maquina>maquinas1 = controller.ordenarPorSubred(maquinas);
        for (Maquina maquina : maquinas1) {
            System.out.println(maquinas1);
            
        }
        System.out.println(maquinas1.size());
    }

    private static List<Maquina> crearMaquinas() {
        List<Maquina> maquinas = new ArrayList<>();

        maquinas.add(new Maquina("Maquina1", "192.168.1.1", Arrays.asList(10, 20, 30)));
        maquinas.add(new Maquina("Maquina2", "192.168.1.2", Arrays.asList(15, 25)));
        maquinas.add(new Maquina("Maquina3", "192.168.1.3", Arrays.asList(5, 35, 45)));
        maquinas.add(new Maquina("Maquina4", "192.168.1.4", Arrays.asList(50)));

        return maquinas;
    }


}
