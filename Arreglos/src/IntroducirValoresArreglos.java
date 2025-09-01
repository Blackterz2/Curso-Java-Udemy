import java.util.Scanner;

public class IntroducirValoresArreglos {
    public static void main(String[] args) {
        // introducir Valores a un Arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporciona el largoo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];

        // solicitar los valores del arreglo
        for (var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona entero[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir los valores del arreglo
        for (var i = 0; i < largoArreglo; i++)
            System.out.println("Valor " + (i + 1) + " proporcioando por ususario: " + enteros[i]);
    }
}
