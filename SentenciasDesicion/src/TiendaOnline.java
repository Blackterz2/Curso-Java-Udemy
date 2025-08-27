import java.util.Scanner;

public class TiendaOnline {
    public static void main(String[] args) {
        System.out.println("Tienda en Línea");
        var consola = new Scanner(System.in);

        System.out.print("Indique monto: ");
        var subMonto = Double.parseDouble(consola.nextLine());

        System.out.print("Es miembro de la tienda (true/false): ");
        var isMiembro = Boolean.parseBoolean(consola.nextLine());

        if (subMonto > 1000 && isMiembro == true){
            var descuento = subMonto * 0.10;
            var montoConDescuento = subMonto - descuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del 10%%
                    \tMonto de la compra: $%.2f
                    \tMonto del descuento: $%.2f
                    \tMonto final de la compra con descuento: $%.2f
                    """, subMonto, descuento, montoConDescuento);
        } else if (subMonto <= 1000 && isMiembro == true) {
            var descuento = subMonto * 0.05;
            var montoConDescuento = subMonto - descuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del 5%%
                    \tMonto de la compra: $%.2f
                    \tMonto del descuento: $%.2f
                    \tMonto final de la compra con descuento: $%.2f
                    """, subMonto, descuento, montoConDescuento);
        }else {
            System.out.printf("""
                    %nNo obtuviste niingún tipo de descuento
                    %nTe invitam,os a hacerte miembro de la tienda
                    \tMonto de la compra: $%.2f
                    """, subMonto);
        }
    }
}
