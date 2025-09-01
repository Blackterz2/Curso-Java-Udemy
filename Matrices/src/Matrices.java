public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz

        // int[][] matriz = new int[2][3];
        final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriz = new int[2][3];

        // modificar valores

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;


        for (var ren = 0; ren < RENGLONES; ren++)

            for (var col = 0; col < COLUMNAS; col++)
                System.out.print("Valor[" + ren + "][" + col  + "] = " + matriz[ren][col]);

    }
}
