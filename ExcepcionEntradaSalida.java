// Exepción 4 con explicación - Excepción de entrada/salida. Presentado por DavidVelásquez.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcepcionEntradaSalida {
    public static void main(String[] args) {
        String nombreArchivo = "archivoInexistente.txt"; // Supongamos que estamos intentando abrir un archivo inexistente.

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("¡Alerta! Error de entrada/salida: " + e.getMessage());
        }
    }
}
