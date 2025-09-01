import java.util.Scanner;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double numero1 = 0, numero2 = 0, resultado;
        var salir = false;
        while (!false){
            System.out.print("""
                    *** Calculadora e Java ***
                    operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. Division
                    5. Salir
                    Escoge una opcion\s""");
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4){
                 System.out.print("Primer numero: ");
                 numero1 = consola.nextDouble();
                System.out.print("segundo numero: ");
                numero2 = consola.nextDouble();

            }
            switch (opcion) {
                case 1 -> {
                    resultado = numero1 + numero2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n"
                            , resultado);
                }
                case 2 -> {
                    resultado = numero1 - numero2;
                    System.out.printf("El resultado de la resta es: %.2f%n"
                            , resultado);
                }
                case 3 -> {
                    resultado = numero1 * numero2;
                    System.out.printf("El resultado de la multiplicacion es: %.2f%n%n"
                            , resultado);
                }
                case 4 -> {
                    resultado = numero1 / numero2;
                    System.out.printf("El resultado de la division es: %.2f%n"
                            , resultado);
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("OPcion invalidad");
                }


            }
        }
    }
}
