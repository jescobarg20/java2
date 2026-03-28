import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RestaurantesCP6 {

    public static void main(String[] args) {

        String archivo = "Restaurants.csv";
        String linea;

        try {

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                while ((linea = br.readLine()) != null) {
                    
                    String[] datos = linea.split(",");
                    
                    // Suponiendo que el código postal está en la columna 3
                    String codigoPostal = datos[2];
                    
                    if (codigoPostal.startsWith("6")) {
                        System.out.println(linea);
                    }
                    
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}