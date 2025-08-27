import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("**Sistema de Autenticación ***");
        var consola = new Scanner(System.in);

        final  var USUARIO = "hola";
        final var PASSWORD = "159";

        System.out.print("Cual es su usuario?: ");
        var Usuarios2 = consola.nextLine();
        System.out.print("Cual es su password?: ");
        var password2 = consola.nextLine();

        var datos = USUARIO.equals(Usuarios2)
                && password2.equals(PASSWORD);
        System.out.println("datos son corretos? " + datos);
    }
}
