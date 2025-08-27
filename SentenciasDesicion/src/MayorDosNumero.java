import java.util.Scanner;

public class MayorDosNumero {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de 2 números ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese un nuemro: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese un nuemro: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        var resusltado = (numero1 > numero2) ? numero1 + " es mayor" : numero2 + " Es mayor";
        System.out.println(resusltado);
        var resusltado2 = Integer.parseInt(resusltado);

    }
}
