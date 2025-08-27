import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Proporciona un dato entero");
        var dato = Integer.parseInt(consola.nextLine());

        // revisamo si esta dentro de rango (entre 1 y 10)

        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10)? " + estaDentroRango);

        // revisar la logica inversa, si el dato está fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10)?" + estaFueraRango);
    }
}
