import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarRestaurantes {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        String archivoOriginal = "Restaurants.csv";
        String archivoNuevo = "Restaurants2.csv";

        try {

            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            FileWriter escritor = new FileWriter(archivoNuevo);

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(",");

                // Suponiendo que el código postal está en la tercera columna
                String codigoPostal = datos[2];

                // Copiar solo los que NO empiezan con 6
                if (!codigoPostal.startsWith("6")) {
                    escritor.write(linea + "\n");
                }

            }

            lector.close();
            escritor.close();

            System.out.println("Archivo Restaurants2.csv creado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al procesar el archivo.");

        }
    }
}