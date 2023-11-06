// Exepción 3 con explicación - Excepción de argumento ilegal. Presentado por DavidVelásquez.

public class ExcepcionArgumentoIlegal {
    public static void main(String[] args) {
        try {
            int edad = -5; // Supongamos que esta es la edad ingresada por el usuario.

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }

            System.out.println("Edad: " + edad);
        } catch (IllegalArgumentException e) {
            System.out.println("¡Alerta! Error de argumento ilegal: " + e.getMessage());
        }
    }
}
