public class ClaseAbstracta {
    public static void main(String[] args) {
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica() {\ // no se puede instanciar
        FiguraGeometrica figuraGeometrica = new rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();

    }
}

// Clase abstracta
abstract class FiguraGeometrica{ // no se puede instancia
    public abstract void dibujar();
}

class rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se debe dibuja un rectagulo");
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un circulo");
    }
}
