package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPErsona;
    private String nombre;                                      // El valor por default
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // incrementar el atributo static
        // Persona.contadorPersonas++;
        this.idPErsona = ++Persona.contadorPersonas; // asignamos el id con ayuda de la variable estatica
    }

    @Override
    public String toString(){
        return "Id: " + this.idPErsona
                + ", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido
                + ", Dir. Men. " + super.toString();
    }

    public int getIdPErsona() {
        return this.idPErsona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
