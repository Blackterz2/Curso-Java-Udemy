public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails");
        var nombreUsuario = "   Gerardo Rondon Salazar   ";
        System.out.println("nombreUsuario = " + nombreUsuario);


        // normalizar el nombre del usuario

        var nombreNormalizado = nombreUsuario.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = "  Global Mentoring  ";
        System.out.println("\nnombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("extensionDominio = " + extensionDominio);

        // convertir los espacios en blancos y convertir a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ",".").toLowerCase();
        // strip limpiar espacion en blanco y replace " " por "."
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamo el Email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
