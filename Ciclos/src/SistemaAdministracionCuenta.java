import javax.xml.transform.Source;
import java.util.Scanner;

public class SistemaAdministracionCuenta {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        // comenzar con la iteracion de menu
        while(!salir){
            System.out.print("""
                    *** Sistema de administración de Cuentas ***
                    1. Crea Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    escoger una opción:\s""");
            var opcion = consola.nextInt();
            // evaluar cada opcion
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta... \n");
                case 3 -> {
                    System.out.println("Saliendo del Sitema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción invalida... \n1");
            }
        }
        System.out.println("Fin del sistema de administración de cuentas");
    }
}
