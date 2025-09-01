public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo while ***");
        var contador = 1;
        while (contador <= 5){
            System.out.println(contador++);
            // primero se usa Contador y despuies se incremeta cuando se vuelva a utilizar
        }
    }
}
