import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31"); // como el valores es String el valor numerico tiene que ser en comilla o cadena
        System.out.println("Valores del mapa");
        persona.entrySet().forEach(System.out::println);
        persona.remove("apellido");
        persona.put("edad", "35");
        System.out.println("Nuevos valores");
        persona.entrySet().forEach(System.out::println);

        // iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llava, valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", valor: "+ valor);
        });
        // persona.forEach((llave, valor) -> System.out.println("Llave: " + llave + ", valor: "+ valor)
        // );
    }
}
