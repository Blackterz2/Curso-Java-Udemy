import java.util.Scanner;

public class SistemaPrestamosLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistemas Prestamo Libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con la credencial de estudiante (true/false)?: ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A Cuantos kilometros vives de la bibloteca?: ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var cumpleCondicion = distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM || tienesCredencial;
        System.out.print("Cumple la condicion: " + cumpleCondicion);

    }
}
