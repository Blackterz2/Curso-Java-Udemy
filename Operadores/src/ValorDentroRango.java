import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro rango ***");
        // Definir los limites
        final var MINIMO = 0;
        final var MAXIMNO = 5;

        // Solicitar un valor entre 0 y 5
        System.out.println("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt((new Scanner(System.in).nextLine()));
        // verificar si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMNO;
        System.out.println(estaDentroRango);
    }
}
