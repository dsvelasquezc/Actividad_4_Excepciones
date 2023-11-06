// Exepción 2 con explicación - Operación no soportada. Presentado por DavidVelásquez.

import java.io.File;  // Importa la clase File del paquete java.io para trabajar con archivos.
import java.util.Scanner;  // Importa la clase Scanner del paquete java.util para leer el archivo.
import java.io.FileNotFoundException; // Importa la excepción FileNotFoundException.

public class ExcepcionOperacionNoSoportada {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivoExistente.txt"); // Crea un objeto File para el archivo "archivoExistente.txt".
            Scanner scanner = new Scanner(archivo); // Crea un objeto Scanner para leer el contenido del archivo.

            if (scanner.hasNextLine()) { // Comprueba si el archivo tiene al menos una línea de texto.
                System.out.println(scanner.nextLine()); // Imprime la primera línea del archivo en la consola.
            }

            scanner.close(); // Cierra el Scanner para liberar los recursos asociados al archivo.
        } catch (FileNotFoundException e) { // Captura la excepción FileNotFoundException si se produce.
            System.out.println("¡Alerta! Error: El archivo no se pudo encontrar o las operaciones no son soportadas."); // Imprime un mensaje de error.
        }
    }
}

