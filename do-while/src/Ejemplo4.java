import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma total es: " + suma);
    }
}

// Suma de números hasta ingresar 0