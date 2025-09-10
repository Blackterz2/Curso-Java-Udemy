package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProducto;
    private static final int MAX_PRODUCTO = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTO];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProducto < Orden.MAX_PRODUCTO)
            this.productos[this.contadorProducto++] = producto;
        else
            System.out.println("Se ha superado el máximo de productos: "
            + Orden.MAX_PRODUCTO);
    }

    public double calcularTotal(){
        double total = 0;
        for (var i = 0; i <this.contadorProducto; i++){
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

//    public void mostrarOrden(){
//        System.out.println("Id Orden: " + this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("\tTotal de la Orden: $" + totalOrden);
//        System.out.println("\tProductos de la Orden: ");
//        for (var i = 0; i < this.contadorProducto; i++)
//            System.out.println("\t\t" + this.productos[i]);
//    }
    @Override
    public String toString(){
        var resultado = "Id Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la Orden: $" + totalOrden + "\n";
        resultado += "\tProductos de la Orden: ";
        for (var i = 0; i < this.contadorProducto; i++)
            resultado += "\t\t" + this.productos[i] + "\n";
        return resultado;
    }

}
