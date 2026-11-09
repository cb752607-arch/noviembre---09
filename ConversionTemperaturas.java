import java.util.Scanner;

public class ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de conversión:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese grados Celsius: ");
                    double c = scanner.nextDouble();
                    double f = (c * 9.0 / 5.0) + 32;
                    System.out.println("Resultado en Fahrenheit: " + f);
                    break;
                case 2:
                    System.out.print("Ingrese grados Fahrenheit: ");
                    double fah = scanner.nextDouble();
                    double cel = (fah - 32) * 5.0 / 9.0;
                    System.out.println("Resultado en Celsius: " + cel);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}