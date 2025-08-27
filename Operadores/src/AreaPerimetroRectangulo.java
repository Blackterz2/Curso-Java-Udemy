import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo Área y perímetro de un Rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Por favor, indique base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Por favor, indique altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Calculamos Area con los datos proporcionados
        var area = base * altura;
        // calculamos perimetro
        var perimetro = 2 * (base + altura);
        System.out.printf("""
                %nResultado:
                ---------------------
                \tArea: %d m²
                \tPerimetro: %d m²
                """, area, perimetro);

    }
}
