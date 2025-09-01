import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        String sistema = System.getProperty("os.name");
        var disponibleBanco = 1000.00;
        var monto = 0.0;
        var salirCajero = false;
        while(!salirCajero){
            System.out.print("""
                    \n*** Aplicación de Cajero Automatico ***
                    Operaciones que puedes realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir\s
                    Ingrese opcion:\s""");
            var opcion = consola.nextInt();
            // opciones
            switch (opcion) {
                case 1 -> System.out.printf("Su Saldo es: %.2f%n%n", disponibleBanco);
                case 2 -> {

                    System.out.print("Ingrese el monto a retirar: " );
                    monto = consola.nextDouble();
                    if (monto <= disponibleBanco)
                        disponibleBanco -= monto;
                    else
                        System.out.printf("No cuenta con el saldo suficiente. saldo actual es: %.2f%n%n", disponibleBanco);
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    monto = consola.nextDouble();
                    disponibleBanco += monto;
                    System.out.println("Tu nuevo saldo es: %.2f%n%n");
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema... \nHasta pronto");
                    salirCajero = true;
                }
                default -> System.out.println("Opcion invalidad.... \n1");

            }
        }

    }
}
