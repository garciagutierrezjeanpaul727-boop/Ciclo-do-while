import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 7, intento;
        do {
            System.out.print("Adivina el número (1-10): ");
            intento = sc.nextInt();
        } while (intento != secreto);
        System.out.println("¡Correcto! El número era " + secreto);
    }
}

// juego de adivinazas