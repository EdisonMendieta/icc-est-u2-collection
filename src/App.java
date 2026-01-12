import Structures.Sets.Sets;
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
        
    }
}
