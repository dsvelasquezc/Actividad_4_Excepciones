// Exepción 1 con explicación - Archivo no existente. Presentado por DavidVelásquez.

import java.io.File;            // Importa la clase File del paquete java.io para trabajar con archivos.
import java.io.FileNotFoundException;  // Importa la excepción FileNotFoundException del paquete java.io.
import java.util.Scanner;        // Importa la clase Scanner del paquete java.util para leer el archivo.

public class ExcepcionArchivoNoEncontrado {
    public static void main(String[] args) {
        try {
            File archivo = new File("ArchivoNoExistente.txt");  // Crea un objeto File que representa el archivo "ArchivoNoExistente.txt".
            Scanner scanner = new Scanner(archivo);             // Crea un objeto Scanner para leer el contenido del archivo.

            if (scanner.hasNextLine()) {         // Verifica si el archivo tiene al menos una línea de texto.
                System.out.println(scanner.nextLine());  // Imprime la primera línea del archivo en la consola.
            }

            scanner.close();  // Cierra el Scanner para liberar los recursos asociados al archivo.
        } catch (FileNotFoundException e) {
            System.out.println("¡Alerta! Error o exepción 'File not Found': " + e.getMessage());  // Maneja la excepción FileNotFoundException. Imprime un mensaje de error y la descripción de la excepción.
        }
    }
}
