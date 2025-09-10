public class FuncionSumar {
    // definimos la funcion sumar
    static int sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultado_funcion = sumar(arg1, arg2);
        System.out.println("Resultado es: " + resultado_funcion);

        arg1 = 3;
        arg2 = 2;
        var resultado_funcion2 = sumar(arg1, arg2);
        System.out.println("Resultado es: " + resultado_funcion2);
    }
}
