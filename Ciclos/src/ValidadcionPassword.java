import java.util.Scanner;

public class ValidadcionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        final var MINIMO_CARCTERES = 6;

        while (!salir){
            System.out.println("""
                    *** Creacion de password ***
                    ------------------------------
                    Por favor ingrese su contraseña
                    la contraseña debe tener minimo 6 caracteres
                    Ingrese contraseña""");
            var password = consola.nextLine();
            var cantidadCaracteres = password.length();
            if (cantidadCaracteres < MINIMO_CARCTERES)
                System.out.println("Contraseña invalidad");
            else
                salir = true;
        }
        System.out.println("Password Valido");
    }
}
