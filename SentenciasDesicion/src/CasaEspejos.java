import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a la casa de los espejos ***");
        var consola = new Scanner(System.in);

        final var EDAD_REQUERIDA = 10;
        System.out.print("Ingrese edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("Le teme a la oscuridad (true/false)");
        var temeOscuridad = Boolean.parseBoolean(consola.nextLine());

        if (!temeOscuridad && edad >= EDAD_REQUERIDA){
            System.out.println("Cumple con las codiciones");
        }else {
            System.out.println("No cumple");
        }
    }
}
