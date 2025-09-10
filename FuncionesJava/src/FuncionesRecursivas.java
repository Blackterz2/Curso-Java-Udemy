public class FuncionesRecursivas {
    // imprimir 1 al 5 usnado una funcion recursiva
    // funcion recursiva
    static void funcionRecursiva(int numero){
        // caso base
        if (numero == 1)
            System.out.print(numero + " ");
        else{
            // Caso recursivvo
            //System.out.print(numero + " "); // si esta primero la impresion se imprime primero el nuemero
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }


}
