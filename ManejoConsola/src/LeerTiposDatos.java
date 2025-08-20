import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int

        var consola = new Scanner(System.in);
        System.out.print("ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        // Leer tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // consumimos el caracter de salto de linea para limpiar
        consola.nextLine();
        // leer un tipo string
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        // tipo flotante
        System.out.println("Proporciona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
