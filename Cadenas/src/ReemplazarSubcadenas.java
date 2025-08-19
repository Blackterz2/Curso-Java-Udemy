public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // reemplazar subcadena
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        // reemplazar "Hola por "Adios"

        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        nuevaCadena = cadena;
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
