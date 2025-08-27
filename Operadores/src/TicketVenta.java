import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("Generacion de ticket  de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio de la Leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de la Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de la Lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de la platanos: ");
        var precioplatanos = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algun descuento (%): ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());


        // calculamos subtotal sin impuesto
        var subtotal = precioLeche + precioPan + precioLechuga + precioplatanos;

        // Aplicar el descuento
        var descuento = subtotal *(descuentoPorcentaje/100.0);
        // subtotal comn descuento
        var subtotalConDescuento = subtotal - descuento;
        // cálculamos impuesto (16%)
        var impuesto = subtotalConDescuento * 0.16;


        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -------------------------------------
                \tSubtotal: $%.2f
                \tdescuento: $%.2f (%d%%)
                \tImpuesto (16%%): $%.2f
                \tCosto total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
