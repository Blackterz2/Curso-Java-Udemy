import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Cuantas Calificaciones desea agregar?: ");
        var calificaciones = Integer.parseInt(consola.nextLine());

        var numeroCalificaciones = new int[calificaciones];
        var promedio = 0.0;

        for (var i = 0; i < numeroCalificaciones.length; i++){
            System.out.print("Calificacion[" + i +"] = ");
            numeroCalificaciones[i] = Integer.parseInt(consola.nextLine());
            promedio += numeroCalificaciones[i];
        }
        var resultado = promedio/calificaciones;
        System.out.println("Promedio de las calificaciones: " + resultado);
        System.out.println("Calificaciones #1 " + numeroCalificaciones[0]);
        System.out.println("Calificaciones #1 " + numeroCalificaciones[1]);
        System.out.println("Calificaciones #1 " + numeroCalificaciones[2]);
        System.out.println("Calificaciones #1 " + numeroCalificaciones[3]);
        System.out.println("Calificaciones #1 " + numeroCalificaciones[4]);
    }
}
