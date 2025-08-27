import java.util.Scanner;

public class SistemaAuteticacionMejorado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        // constantes del usuario
        final var USUARIO = "Blackterz";
        final var PASSWORD = "159";

        // Inicio de sesion
        System.out.print("Ingrese usuario: ");
        var usuarioIngresado = consola.nextLine().strip();
        System.out.print("Ingrese password: ");
        var passwordIngresado = consola.nextLine().strip();

        // Validacion de usuario
        var mensajeAutenticacion = switch (usuarioIngresado){
            case USUARIO -> {
                if (PASSWORD.equals(passwordIngresado))
                    yield "Bienvenido al sistema";
                else
                    yield "Password incorrecto, por favor corregirlo";
            }
            default -> {
                if (PASSWORD.equals(passwordIngresado))
                    yield "Usuario incorrecto, foavor de corregirlo!";
                    else
                        yield "usuario y password incorretos, favor de corregirlo";
            }
        };
        // impirmir
        System.out.println(mensajeAutenticacion);
        //version if el
        //        if (USUARIO.equals(usuarioIngresado)) {
        //            if (PASSWORD.equals(passwordIngresado)) {
        //                System.out.println("*** Bienvenido al Sistema ***");
        //            } else {
        //                System.out.println("password invalido");
        //            }
        //        } else {
        //            // Si el usuario no es correcto, no hay necesidad de comprobar la contraseña
        //            if (PASSWORD.equals(passwordIngresado)) { // Aunque la contraseña sea correcta, el usuario no lo es.
        //                System.out.println("Usuario invalido");
        //            } else {
        //                System.out.println("usuario y password invalidos");
        //            }
        //        }



        // version boolean if else
        // boolean usuarioCorrecto = USUARIO.equals(usuarioIngresado);
        //boolean passwordCorrecto = PASSWORD.equals(passwordIngresado);
        //
        //if (usuarioCorrecto && passwordCorrecto) {
        //    System.out.println("*** Bienvenido al Sistema ***");
        //} else if (usuarioCorrecto) {
        //    System.out.println("password invalido");
        //} else if (passwordCorrecto) {
        //    System.out.println("Usuario invalido");
        //} else {
        //    System.out.println("usuario y password invalidos");
        //}
    }
}
