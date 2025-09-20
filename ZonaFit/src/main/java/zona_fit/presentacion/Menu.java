package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        // creamos un objeto de la clase cliente
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar  opciones: " + e.getMessage());
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit (GYM)
                1. Lista Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());

    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDAO){
        var salir = false;
        switch (opcion){
            case 1 -> {// listar clientes
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDAO.listarCliente();
                clientes.forEach(System.out::println);
                // se ejecuta esta opcion y regresa a menu con el valor de salir = false
            }
            case 2 -> { // Buscar cliente por id
                System.out.println("introduce el id del cliente a buscar");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else
                    System.out.println("Cliente no encontrado: " + cliente);
            }
            case 3 -> { // Agregar cliente
                System.out.println("--- Agregar cliente ---");
                System.out.print("Proporciones nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciones apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Indique membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(nombre, apellido, membresia);
                var clienteAgregado = clienteDAO.agregarCliente(cliente);
                if (clienteAgregado)
                    System.out.println("Cliente agregado exitosamente: " + clienteAgregado);
                else
                    System.out.println("Error al agregar cliente: "+ clienteAgregado);
            }
            case 4 -> { // modificar Cliente
                System.out.println("--- modificar cliente ---");
                System.out.print("nuevo nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Nuevo apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                System.out.print("prorpocione la id a modificar: ");
                var id = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(id, nombre, apellido, membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado)
                    System.out.println("Cliente modificado: " + cliente);
                else
                    System.out.println("Cliente no modificado: " + cliente);
            }
            case 5 ->{ // Eliminar cliente
                System.out.println("--- Eliminara un cliente ---");
                System.out.print("id de cliente a eliminar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado)
                    System.out.println("Cliente eliminado: " + cliente);
                else
                    System.out.println("Cliente no elimiando: " + cliente);
            }
            case 6 -> { // salir del programa
                System.out.println("Hasta pronto!");
                salir = true;
            }
        }
        return salir;
    }
}
