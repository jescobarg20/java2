import java.io.File;
import java.util.Scanner;

public class InformacionFichero {

    public static void main(String[] args) {

        // Pedir la ruta al usuario
        try (Scanner teclado = new Scanner(System.in)) {
            // Pedir la ruta al usuario
            System.out.println("Ingrese la ruta del fichero o directorio:");
            String ruta = teclado.nextLine();
            
            File archivo = new File(ruta);
            
            // Verificar si existe
            if (archivo.exists()) {
                
                System.out.println("El fichero SI existe.");
                
                // Verificar si es directorio o archivo
                if (archivo.isDirectory()) {
                    
                    System.out.println("Es un DIRECTORIO.");
                    
                } else if (archivo.isFile()) {
                    
                    System.out.println("Es un FICHERO.");
                    
                    // Mostrar datos del fichero
                    System.out.println("Nombre: " + archivo.getName());
                    System.out.println("Tamaño: " + archivo.length() + " bytes");
                    System.out.println("Permiso de lectura: " + archivo.canRead());
                    System.out.println("Permiso de escritura: " + archivo.canWrite());
                }
                
            } else {
                
                System.out.println("El fichero NO existe.");
            }
        }
    }
}