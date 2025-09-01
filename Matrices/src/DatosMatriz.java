import java.util.Scanner;

public class DatosMatriz {
    public static void main(String[] args) {
        // introducir valores a una matriz

        int reglones, columnas;
        var consola = new Scanner(System.in);

        // definir la matriz
        System.out.print("Proporcionar los renglones: ");
        reglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona  la columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[reglones][columnas];

        // solicitar los valores
        for (var ren = 0; ren < reglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // iterar lkos valores de la matriz
        for (var ren = 0; ren < reglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
        for (var ren = 0; ren < reglones; ren++){
            System.out.println();
            for (var col = 0; col < columnas; col++){
                System.out.print("[" + matriz[ren][col] + "]");
            }
        }

    }
}
