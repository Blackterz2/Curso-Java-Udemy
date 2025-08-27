import java.sql.SQLOutput;
import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a salud y fitness ***");
        var consola = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Pasos Diarios: ");
        var pasoDiarios = Integer.parseInt(consola.nextLine());

        // Constantes
        final var META_PASOS_DIARIO = 1000;
        final var CALORIAS_POR_PASO = 0.04; // valor aproximado en kilocalorias

        var caloriasQuemadas = pasoDiarios * CALORIAS_POR_PASO;
        // meta_alcanzada = pasos_diarios >+ META_PASOS_DIARIO
        // Verificar si se cumple la meta
        if (pasoDiarios >= META_PASOS_DIARIO){
            System.out.printf("""
                    %nFelicidades %s, Cumpliste la meta diaria
                    --------------------------------------
                    \tPasos del dia: %d
                    \tcalorias quemadas: %.2f cal
                    """, usuario, pasoDiarios, caloriasQuemadas);
        } else{
            System.out.printf("Meta no alcanza u.u. \n\tCalorias quemadas; %.2f", caloriasQuemadas);
        }

    }
}
