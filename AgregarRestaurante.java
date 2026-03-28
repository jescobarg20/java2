import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarRestaurante {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Abrir el archivo en modo agregar
            FileWriter archivo = new FileWriter("Restaurants.csv", true);

            System.out.println("Ingrese el nombre del restaurante:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la direccion:");
            String direccion = sc.nextLine();

            System.out.println("Ingrese el codigo postal:");
            String codigoPostal = sc.nextLine();

            // Escribir en el mismo formato CSV
            archivo.write(nombre + "," + direccion + "," + codigoPostal + "\n");

            archivo.close();

            System.out.println("Datos agregados correctamente al archivo.");

        } catch (IOException e) {

            System.out.println("Error al escribir en el archivo.");

        }

        sc.close();
    }
}