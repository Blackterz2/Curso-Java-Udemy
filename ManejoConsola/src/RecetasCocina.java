import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("**  Recetas de Cocina **");
        var consola = new Scanner(System.in);
        // Nombre de la receta
        System.out.print("Ingrese el nombre: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes principales
        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparacion
        System.out.print("Tiempo de preparación: ");
        var tiempo = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tnombreReceta = " + nombreReceta);
        System.out.println("\tingredientes = " + ingredientes);
        System.out.println("\ttiempo = " + tiempo + " min");
        System.out.println("\tdificultad = " + dificultad);



    }
}
