public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Acumulador Suma ***");

        final var MACIMO = 5;
        var acumuladorSuma = 0;

        // iterar los valores
        var numero = 1;
        while (numero <= MACIMO){
            // imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> "
                    + acumuladorSuma + " + " + numero);

            // realizar la suma acumulativa
            acumuladorSuma += numero++; // AcumuladorSuma Acumulador + numero
            // numero++; se ahorra esta linea

            // imprimir la suma parcial acumulada
            System.out.println("Suma parcial Acumulada: " + acumuladorSuma + "\n");

        }
        System.out.println("Suma de los pimeros " + MACIMO + " numeros: " + acumuladorSuma);


    }
}
