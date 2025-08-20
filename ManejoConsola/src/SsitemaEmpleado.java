import java.util.Scanner;

public class SsitemaEmpleado {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);

        // introducir informacion de empleado
        System.out.print("Por favor, escriba su nombre: ");
        var nombreEmpleado = consola.nextLine();
        // Pedimos edad
        System.out.print("Introducir edad: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("SAlario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Indicamos si es jefe de departamento
        System.out.println("Es jefe de departamento true/false: ");
        var isJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // imprimir lso valores del empleado
        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tedad = " + edadEmpleado);
        System.out.println("\tsalario = " + salarioEmpleado);
        System.out.printf("\tSalario $%.2f%n", salarioEmpleado);
        System.out.println("\t Es jefe de departamento? " + isJefeDepartamento);



    }
}
