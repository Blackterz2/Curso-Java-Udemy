import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema Bancario ***");

        var consola = new Scanner(System.in);

        System.out.println("Desea salir del sistema (true/false)");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        // Verificamos (aplicando logica inversa)
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo de sistema...");
        }
    }
}
