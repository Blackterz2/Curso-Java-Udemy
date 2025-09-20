package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

    @Autowired
    private IClienteServicio clienteServicio;

    private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

    String nl = System.lineSeparator();

	public static void main(String[] args) {
        logger.info("Iniciando la aplicacion");
		SpringApplication.run(ZonaFitApplication.class, args);
        logger.info("Aplicacion finalizada");
	}

    @Override
    public void run(String... args) throws Exception {

        zonaFitApp();
    }

    private void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);

        while (!salir){
            var opcion = mostrarMenu(consola);
            salir = ejecutarOpciones(consola, opcion);
            logger.info(nl);
        }

    }


    private Integer mostrarMenu(Scanner consola){
        logger.info("""
                \n*** Menu ***
                1. Listar clientes
                2. Buscar Clientes
                3. Agregar Clientes
                4. Modificar Cliente
                5. Eliminar cliente
                6. salir
                por favor, elije una opcion\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private boolean ejecutarOpciones(Scanner consola, int opcion){
        var salir = false;
        switch (opcion){
            case 1 -> {
                logger.info(nl + "--- Listado de clinetes ---" + nl);
                List<Cliente> clientes = clienteServicio.listarCliente();
                clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
            }
            case 2 -> {
                logger.info("id del cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                Cliente encontrado = clienteServicio.buscarClientePorId(idCliente);
                if (encontrado != null)
                    logger.info(nl + "Cliente encontrado: " + encontrado + nl);
                else
                    logger.info(nl + "Cliente no encontrado: " + encontrado + nl);
            }
            case 3 -> {
                logger.info(nl + "--- Agregar cliente ---" + nl);
                logger.info("nombre: ");
                var nombre = consola.nextLine();
                logger.info("Apellido: ");
                var apellido = consola.nextLine();
                logger.info("membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                Cliente nuevoCliente = new Cliente(); // new Cliente(null, nombre, apellido, membresia);
                nuevoCliente.setNombre(nombre);
                nuevoCliente.setApellido(apellido);
                nuevoCliente.setMembresia(membresia);
                clienteServicio.guardarCliente(nuevoCliente);
            }
            case 4 -> {
                logger.info(nl + "Modificar cliente" + nl);
                logger.info("id de cliente: ");
                var id = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(id);
                if (cliente != null) {
                    logger.info("nombre: ");
                    var nombre = consola.nextLine();
                    logger.info("Apellido: ");
                    var apellido = consola.nextLine();
                    logger.info("membresia: ");
                    var membresia = Integer.parseInt(consola.nextLine());
                    Cliente nuevoCliente = new Cliente(id, nombre, apellido, membresia);
                    clienteServicio.guardarCliente(nuevoCliente);
                    logger.info("Cliente modificado: " + nuevoCliente);
                }
                else
                    logger.info(nl + "Cliente no encontrado: " + id + nl);
            }
            case 5 -> {
                logger.info(nl + "Eliminar un cliente" + nl);
                logger.info("Proporcione id del cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null) {
                    Cliente eliminarCliente = new Cliente();
                    eliminarCliente.setId(idCliente);
                    clienteServicio.eliminarCliente(eliminarCliente);
                }
                else
                    logger.info(nl + "Cliente no encointrado" + nl);
            }
            case 6 -> {
                logger.info("Hasta pronto!" + nl + nl);
                salir = true;
            }
            default -> logger.info("Opcion NO reconocida: " + opcion + nl);
        }

        return salir;

    }



}
