package maquina_snacks_archivos.servicios;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{
    private final  String NOMBRE_ARCHIVO = "snacks.txt";
    // crear la lsita de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor clase
    public ServicioSnacksArchivos(){
        // creamos el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if (existe){
               this.snacks = obtenerSnacks();
            }
            else {
                var salida = new PrintWriter(new PrintWriter(archivo));
                salida.close(); // con esto se guarda el archivo en disco
                System.out.println("Se ha cxreado el archivo");
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        // si no existe, cargamos algunos snacks iniciales
        if (!existe)
            cargarSnacksIniciales();
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("pepito", 30));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private  List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas =  Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for(String linea: lineas){
                String[] lineasSnack = linea.split(",");
                var idSnack = lineasSnack[0];
                var nombre = lineasSnack[1];
                var precio = Double.parseDouble(lineasSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack); // agregamos el snack leido a la lista
            }
        }catch (Exception e){
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // agregamos el nuevo snack,
        // 1.  a la lista en memoria
        this.snacks.add(snack);
        // 2 guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        }catch (Exception e){
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ");
        // mostramos la lista de snack en el archivo
        var inventarioSnacks = "";
        for (var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
