import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP ***");
        final  var NO_PRODUCTO_DESCUENTO = 10;

        var consola = new Scanner(System.in);

        System.out.print("¿Cuántos productos compraste hoy?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("¿Tines la membresia de la tienda (True/false)?: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTO_DESCUENTO  && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP? " + esElegibleDescuento);
    }
}
