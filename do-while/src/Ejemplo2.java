import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);
        System.out.println("Número válido: " + numero);
    }
}

// Validación de entrada
