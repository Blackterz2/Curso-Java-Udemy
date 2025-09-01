import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Triángulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();

        // Iteramos sobre cadda fila del triángulo
        for (var fila = 1; fila <= numeroFilas; fila++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila -1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
