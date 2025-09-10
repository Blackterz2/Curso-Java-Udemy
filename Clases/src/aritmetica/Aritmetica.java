package aritmetica;

public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado de la resta: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** aritmetica.Aritmetica ***");
        var arimetica1 = new Aritmetica();
        arimetica1.operando1 = 5;
        arimetica1.operando2 = 7;
        arimetica1.sumar();
        arimetica1.restar();
        System.out.println("\n objeto 2");

        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}
