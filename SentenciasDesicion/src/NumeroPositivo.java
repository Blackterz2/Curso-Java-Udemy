import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        System.out.println("*** Revisar si un número es Positivo ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciones un nuemro: ");
        var numero = Integer.parseInt(consola.nextLine());
        if (numero > 0){
            System.out.println("Es positivo:" + numero);
        } else if (numero < 0 ) {
            System.out.println("Es negativo:" + numero);

        } else {
            System.out.println("Es cero: " + numero);
        }
    }
}
