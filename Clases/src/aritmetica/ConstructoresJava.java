package aritmetica;

public class ConstructoresJava {
    private int operando1;
    private int operando2;

    //constructor vacio
    public ConstructoresJava(){

    }

    public ConstructoresJava(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2; // this. se utiliza para diferencia Atributos de parametros de constructor

    }

    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2; // opcional usar this.
        System.out.println("resultado de la resta: " + resultado);
    }
    public int getOperando1(){
        return this.operando1;
    }


    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
