public class Fibonacci {
    public static void main(String[] args) {
        int index = 15;
        int[] D = new int[index];

        // Inicializamos los primeros dos elementos

        D[0] = 1;
        D[1] = 1;

        // Generamos el resto de la secuencia
        for (int i = 2; i < index; i++) {
            D[i] = D[i - 2] + D[i - 1];
        }

        // Imprimimos la secuencia en la consola
        for (int i = 0; i < index; i++) {
            System.out.print(D[i] + " ");
        }
    }
}
