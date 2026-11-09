import java.util.Scanner;

public class AdivinanzaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 25; // Número definido de ejemplo
        int numeroIngresado;
        int intentos = 0;

        do {
            System.out.print("Adivina el número secreto: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado > numeroSecreto) {
                System.out.println("Muy alto");
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("¡Correcto!");
                System.out.println("Intentos realizados: " + intentos);
            }
        } while (numeroIngresado != numeroSecreto);

        scanner.close();
    }
}