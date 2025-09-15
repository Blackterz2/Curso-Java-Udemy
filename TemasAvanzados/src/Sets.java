import java.util.Set;
import java.util.TreeSet;



public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Gerardo");
        conjunto.add("Gerardo"); // dato Set no permite elementos duplicados
        conjunto.add("Milagros");
        conjunto.add("Rondon");
        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);

        // Remover elemento
        conjunto.remove("Rondon");
        System.out.println("\nNuevos elementos");
        conjunto.forEach(System.out::println);

    }
}
