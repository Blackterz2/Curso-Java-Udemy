public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Números Pares del 1 al 20 ***");
        var contador = 1;
        while (contador <= 20){
            if (contador % 2 == 1)
                // REVISAMOS SI ES UN NUMERO PAR
                System.out.print(contador + " ");
            contador++;
        }
    }
}
