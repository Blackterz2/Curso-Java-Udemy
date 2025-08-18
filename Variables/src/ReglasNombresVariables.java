public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres Variables
        String nombreCompleto = "Gerardo Rondon";
        System.out.println(nombreCompleto);
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Gerard Rond"; // otra variable por la sensibilidad de mayuscula. no es uan buena practica
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-Cliente = "Gerardo"; // incorrecto
        String nombre_cliente = "Gerardo"; // Es correcto, no aplcia buena practica
        String _apellido = "SAlazar"; // Correcto
        String $apellido = "Rondon"; // Correcto y aceptable
        int totPzs = 10; //  Correcto, no aplica buenas practica
        int totalPiezas = 10; // Correcto, aplica las buenas practicas

    }
}
