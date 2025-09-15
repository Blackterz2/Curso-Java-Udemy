public class ArgumentosVariables {
    public static void main(String[] args) {
       // imprimirNumeros(1, 2, 3, 4, 5); // argumentos variales-
                                        // var args- varargs
        variosParametros("Karla", 10, 20, 30 , 40);
    }

    static void variosParametros(String  nombre, int... numero) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numero);
    }

    // static void imprimirNumeros(int i, int i1, int i2, int i3, int i4)
    static void imprimirNumeros(int... numeros){
        for(var i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
    }
}
