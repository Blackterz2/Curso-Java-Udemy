public class Arreglos {
    public static void main(String[] args) {
        // Arreglos
        // 1. Declaramos un arreglo
        // int[] enteros;
        // 2. Inicializar el arreglo
        // enteros = new int[3]; // se almacena en la Memoria Stack en la seccion de la memoria heap
        // declarar e inicializar un arreglo
        // int[] numeros = new int[2];

        var enteros = new int[5];

        // modificar los elemento ya que por defecto son "0"
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        // Leemos algunos valores
        System.out.println("valor 1 = " + enteros[0]);
        System.out.println("valor 2 = " + enteros[1]);
        System.out.println("valor 3 = " + enteros[2]);
        System.out.println("valor 4 = " + enteros[3]);
        System.out.println("valor 5 = " + enteros[4]);


    }
}
