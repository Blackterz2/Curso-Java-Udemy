package prueba;

import aritmetica.ConstructoresJava;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** aritmetica.Aritmetica ***");
        var arimetica1 = new ConstructoresJava(5, 7);
        System.out.println("Atributo operando1: " + arimetica1.getOperando1());
        arimetica1.setOperando1(10);
        arimetica1.setOperando2(15);

        arimetica1.sumar();
        arimetica1.restar();

        // nuevo objeto
        System.out.println();
        var arimetica2 = new ConstructoresJava(52, 72);

        arimetica1.sumar();
        arimetica1.restar();


    }
}
