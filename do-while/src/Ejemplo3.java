import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Has elegido sumar.");
                case 2 -> System.out.println("Has elegido restar.");
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}

// Menú interactivo