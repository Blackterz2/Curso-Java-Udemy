public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado = 0;
        var c = true;
        // Operador unario +
        resultado = +a;
        System.out.println("Resultado +a = " + a);
        // operador unario -
        resultado= -a;
        System.out.println("resultado -a = " + a);

        // operadorres unarios incremento/decremento
        System.out.println("\n*pre-incremento*");
        //pre-incremento
        a = 3;
        resultado = ++a; // priemro se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        System.out.println("\n*post-incremento*");
        // Post-incremento
        a = 3;
        resultado = a++; // priemro se usa el valor y despues se incrementa
        System.out.println("resultado a++  = " + resultado);
        System.out.println("a en este momento = " + a);
        System.out.println("\n*pre-decremento*");
        //pre-decremento
        b = -2;
        resultado = --b; // primero se incrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);

        System.out.println("\n*post-decremento*");
        // post-decremento
        b = -2;
        //resultado = b--;

    }
}
