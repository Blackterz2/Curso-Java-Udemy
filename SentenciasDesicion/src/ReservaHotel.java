import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema  Reserva Hotel ***");

        var console = new Scanner(System.in);

        // Pedimos datos usuarios
        System.out.print("Nombre del cliente: ");
        var cliente = console.nextLine();

        System.out.println("Dias de estadia en el hotel: ");
        var diaEstadia = Integer.parseInt(console.nextLine());

        // tarifa de tipo de cuarto
        final var SIN_VISTA_MAR = 150.50;
        final var CON_VISTA_MAR = 190.50;
        var costoCuarto = 0.00;
        System.out.println("El cuarto cuenta con vista al mar?:");
        var tipoVista = Boolean.parseBoolean(console.nextLine());
        if (tipoVista) {
            costoCuarto = CON_VISTA_MAR * diaEstadia;
            System.out.printf("""
                    %nInformacion de reserva
                    ---------------------------------
                    \tUsuario: %s
                    \tDias de estadia: %d dias
                    \tHabitacion con vista al mar
                    \tCosto total: $%f
                    """, cliente, diaEstadia, costoCuarto);
        }else {
            costoCuarto = SIN_VISTA_MAR * diaEstadia;
            System.out.printf("""
                    %nInformacion de reserva
                    ---------------------------------
                    \tUsuario: %s
                    \tDias de estadia: %d dias
                    \tHabitacion sin vista al mar
                    \tCosto total: $%f
                    """, cliente, diaEstadia, costoCuarto);
        }


    }
}
