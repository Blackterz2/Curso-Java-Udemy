package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y Objeto persona ***");
        System.out.println("Variable Estatica: "
                + Persona.getContadorPersonas());
        var objeto1 = new Persona("Gerardo", "Rondon");
        System.out.println(objeto1); // aunque tambien se manda automaticamente
        System.out.println("Variable estatica: "
                + Persona.getContadorPersonas());

        // segundo objeto
        var objeto2 = new Persona("Hola", "Mundo");
        System.out.println(objeto2);
        System.out.println("varable estatica: "
                + Persona.getContadorPersonas());

    }


}
