import java.util.Enumeration;

public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y continue ***");

        for (var numero = 1; numero <10; numero++){
            if(numero % 2 == 0){
                System.out.println(numero);
                break;
            }
        }
        // Ejemplo con continue. Imprimir solo numeros pares, ignorar IMPARES
        System.out.println("\nPalabras continue");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 1){
                continue; // Saltamo a la siguiente iteracion
            }
            System.out.println(numero + " "); // numero pares
        }


    }

}
