public class BusquedaSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        // subcadena a buscar "Hola"
        var indece1 = cadena1.indexOf("Hola");
        System.out.println("indece1 = " + indece1);
        //lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);

    }
}
