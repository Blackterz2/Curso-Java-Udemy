import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        var consola = new Scanner(System.in);
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;
        System.out.print("Ingrese el destino del pquete (nacional/internacional: )");
        var destino = consola.nextLine().strip().toLowerCase(); // agregamos

        System.out.println("Ingrese el peso del paquete (en Kg)");
        var pesoPaquete = Double.parseDouble(consola.nextLine());
        var costoEnvio = switch (destino){
            case "nacional" -> pesoPaquete * TARIFA_NACIONAL;
            case "internacional" -> pesoPaquete * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destinop invalidad. Ingresa nacional/internacional");
                yield null;
            }
        };

        if (costoEnvio != null) // para no imprimir si es null
        System.out.printf("El costo del Envio del paquete es : $%.2f = ", costoEnvio);
        // Calculamos costo del envio


//        if(destino.equals("nacional")) // equalsIgnoreCase() ignora mayurcula/yminusculas
//            costoEnvio = 10 * pesoPaquete;
//        else if (destino.equals("internacional"))
//            costoEnvio = 20 * pesoPaquete;
//        else {
//            System.out.println("Destino invalido");
//        }
//        System.out.printf("""
//                %nDestalle del envio
//                --------------------------
//                \tCosto del paquete es: $%.2f
//                """, costoEnvio);
    }
}
