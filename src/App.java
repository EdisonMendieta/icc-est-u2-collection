import Structures.maps.EjerciciosMapas;
import controller.MaquinaController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import models.Maquina;

public class App {
    public static void main(String[] args) throws Exception {
        /*Sets setsClase = new Sets();
        Set<String> hashSet = setsClase.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        System.out.println("A".hashCode());
        */
        
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

        /*Set<String> linkedHash = setsClase.construirLinkedHashSet();
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
        */
        runEjercicios();
        
        
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

    private static void runEjercicios(){
        EjerciciosMapas ejercicios = new EjerciciosMapas();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,18, 19, 20,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> list1 = Arrays.asList(
            4, 5, 1, 2, 5, 4, 3, 2, 1, 6,
            7, 3, 8, 9, 6, 7, 10
        );
        List<String[]> entradas = List.of(
            new String[]{"Ana", "80"},
            new String[]{"Luis", "90"},
            new String[]{"Carlos", "70"},
            new String[]{"Ana", "85"},
            new String[]{"Sofia", "95"},
            new String[]{"Luis", "88"},
            new String[]{"Pedro", "60"},
            new String[]{"Maria", "75"}
        );

        Map<String, Integer> datos = new HashMap<>();
            datos.put("Computacion-Ana", 85);
            datos.put("Computacion-Luis", 92);
            datos.put("Electronica-Carlos", 78);
            datos.put("Electronica-Maria", 88);
            datos.put("Computacion-Pedro", 90);
            datos.put("Mecanica-Juan", 80);
            datos.put("Mecanica-Sofia", 95);

        System.out.println("====Ejercicios Mapas====");
        System.out.println("\nContar dublicados ");
        System.out.println(ejercicios.contarDublicados(list));
        System.out.println("\nPrimer no repetido ");
        System.out.println(ejercicios.primerNoRepetido(list1));
        System.out.println("\nRanking puntajes");
        ejercicios.RankingPuntajes(entradas);
        System.out.println("\nMejor puntaje por carrera");
        ejercicios.notaMasAltaCarreras(datos);

        
    }


}
