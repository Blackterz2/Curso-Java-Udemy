import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único ***");

        var generadorID = new Random();
        var consola = new Scanner(System.in);

        // Pedir nombre y apellido
        System.out.print("¿Cual es tu nombre?: ");
        var nombre = consola.nextLine();
        nombre = nombre.toUpperCase();
        System.out.print("Cual es tu apellido?: ");
        var apellido = consola.nextLine();
        apellido = apellido.toUpperCase();
        //Año nacimiento
        System.out.print("Cual es tu año de nacimiento (YYYY):");
        var nacimiento = consola.next();

        //  primero  dos letras
        var subNombre = nombre.substring(0, 2);
        var subApellido = apellido.substring(0, 2);
        var subNacimineto = nacimiento.substring(2, 4);

        // generar ID
        var generarid = generadorID.nextInt(9999) + 1;

        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificacion (ID) generado por el sistema es:
                \t%s%s%s%04d
                \tFelicidades!
                """,nombre, subNombre, subApellido, subNacimineto, generarid);

    }
}
