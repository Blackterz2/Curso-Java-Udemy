public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sitema de Reserva de Hoteles ***");
        var nombre = "Gerardo";
        var apellido = "Rondon";
        var nombreCliente = nombre + " " + apellido;
        System.out.println("nombreCliente = " + nombreCliente);
        var diaEstancia = 10;
        System.out.println("diaEstancia = " + diaEstancia);
        var tarifaDiaria = 3000.00;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        var vistaMar = true;
        System.out.println("vistaMar = " + vistaMar);

        System.out.println("");

        nombreCliente = "Jose Salazar";
        System.out.println("vistaMar = " + vistaMar);
        diaEstancia = 15;
        System.out.println("vistaMar = " + vistaMar);
        System.out.println("TarifaDiaria= " + tarifaDiaria);
        vistaMar = false;
        System.out.println("vistaMar = " + vistaMar);
    }
}
