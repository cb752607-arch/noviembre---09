import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double sumaTotal = 0;
        int cantidadNotas = 0;
        char continuar;

        do {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();
            
            sumaTotal += nota;
            cantidadNotas++;

            System.out.print("¿Continuar? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        double promedio = sumaTotal / cantidadNotas;
        System.out.printf("Promedio: %.2f\n", promedio);

        scanner.close();
    }
}