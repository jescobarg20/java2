import java.io.File;
import java.util.Scanner;

public class BorrarArchivo {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la ruta del archivo que desea eliminar:");
        String ruta = sc.nextLine();

        File archivo = new File(ruta);

        if (archivo.exists()) {

            if (archivo.delete()) {
                System.out.println("El archivo fue eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }

        } else {
            System.out.println("El archivo no existe.");
        }

        sc.close();
    }
}