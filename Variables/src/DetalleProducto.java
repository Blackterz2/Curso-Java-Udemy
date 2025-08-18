public class DetalleProducto {
    public static void main(String[] args) {
        // Detalle del producto
        System.out.println("**** Tienda en linea (Detalle Producto)");

        String nombreProducto = "Cafe";
        System.out.println("nombreProducto = " + nombreProducto);
        double precioProducto = 1270.50;
        System.out.println("precioProducto = " + precioProducto);
        int cantidadDisponible = 60;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        boolean isDisponible = true;
        System.out.println("isDisponible = " + isDisponible);

        System.out.println();
        nombreProducto = "Azucar";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 23;
        System.out.println("precioProducto = " + precioProducto + "$");
        cantidadDisponible = 100;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        isDisponible = true;
        System.out.println("isDisponible = " + isDisponible);

    }
}
