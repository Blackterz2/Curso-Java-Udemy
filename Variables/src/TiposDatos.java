public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong = " + tipoLong);
        
        // Punto flotante
        float TipoFloat = 3.14F;
        System.out.println("TipoFloat = " + TipoFloat);
        double tipoDouble = 3.1315; // D 0 d  opcional indicar que es tipo double
        System.out.println("tipoDouble = " + tipoDouble);
        
        // Caracter
        char tipoChar = 'A'; // caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // boolean
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // topo object (referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Gerardo Rondon";
        System.out.println("nombre = " + nombre);
    }
}
