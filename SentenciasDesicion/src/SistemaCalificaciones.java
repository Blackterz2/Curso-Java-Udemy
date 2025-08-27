import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.println("Calificacion:");
        var nota = Double.parseDouble(consola.nextLine());
        var calificacion = "";
        if(nota >= 9 && nota <= 10)
            calificacion = "A";
        else if (nota >= 8 && nota < 9)
            calificacion = "B";
        else if (nota >= 7 && nota < 8)
            calificacion = "C";
        else if (nota >= 6 && nota < 7)
            calificacion = "D";
        else if (nota >= 0 && nota < 6)
            calificacion = "F";
        else
            System.out.println("Valor desconocido");
        System.out.printf("LA calificacion %.1f es equivalente a %s ", nota, calificacion);
    }
}
