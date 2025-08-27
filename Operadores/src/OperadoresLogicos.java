public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("*** Operadores And ***");
        boolean a = true, b = false;
        // and (regresa true si ambos valores son true)
        
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        resultado = a && a;
        System.out.println("resultado = " + resultado);

        System.out.println("*** Operadores Or ***");
        // or ( regresa true si cualquiera de los valores es true)
        // boolean a = true, b = false;

        resultado = a || b; // | Caracter pipe |
        System.out.println("resultado = " + resultado);
        resultado = b || b;
        System.out.println("resultado = " + resultado);

        System.out.println("*** Operador not ***");
        // not (invierte el valor)
        resultado = !a;
        System.out.println("resultado = " + resultado);






    }
}
