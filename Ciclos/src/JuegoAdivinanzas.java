import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var randon = new Random();

        var numeroRandon = randon.nextInt(50) + 1;
        var ganaste = false;
        var contadorIntento = 1;
        while (!ganaste){
            System.out.print("""
                    Bienvenido a juego Adivina el numero
                    \tAdivina el numero entre 1 y 50
                    \tEngrese nuemro\s""");
            var numero = consola.nextInt();
            if (numero < numeroRandon)
                System.out.println("Numero muy bajo. Intento numero " + contadorIntento++);
            else if (numero > numeroRandon)
                System.out.println("Numero muy alto. Intento numero " + contadorIntento++);
            else if (numero == numeroRandon) {
                System.out.println("Felicidades ganaste\n");
                ganaste = true;
            }

        }
    }
}
