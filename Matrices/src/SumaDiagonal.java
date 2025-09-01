public class SumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Suma Diagonal de la matriz ***");

        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600},
                {700, 800, 900}
        };

        var sumador = 0;
        for (var filas = 0; filas < matriz.length; filas++){
            for (var columnas = 0; columnas < matriz[filas].length; columnas++){
                if (filas == columnas)
                    sumador += matriz[filas][columnas];
            }
        }
        System.out.println("suma: " + sumador);
    }
}
