import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        var largo = miLista.size();
        System.out.println(largo + " Dias de la semana\n");


        for (Object elemento: miLista){
            System.out.println("Dia de la semana: = " + elemento);

        }
        System.out.println();
        
        // funciones lambda (funcion anonima de un codigo muy compacto)
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        } );
        System.out.println("\nMetodo de referencia println");
        miLista.forEach(System.out::println);
        
        List<String> nombres = Arrays.asList("Gerardo", "Milagros");
        System.out.println("\nLista de nombres: ");
        nombres.forEach(System.out::println);
    }
}
