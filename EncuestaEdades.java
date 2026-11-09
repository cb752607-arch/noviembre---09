import java.util.Scanner;

public class EncuestaEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadPersonas = 0;
        int sumaEdades = 0;
        int edadMayor = Integer.MIN_VALUE;
        int edadMenor = Integer.MAX_VALUE;
        int mayoresDeEdad = 0;
        char continuar;

        do {
            System.out.print("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();

            cantidadPersonas++;
            sumaEdades += edad;

            // Evaluamos la edad mayor y menor
            if (edad > edadMayor) {
                edadMayor = edad;
            }
            if (edad < edadMenor) {
                edadMenor = edad;
            }

            // Contamos si es mayor de edad (18 o más)
            if (edad >= 18) {
                mayoresDeEdad++;
            }

            System.out.print("¿Desea registrar otra persona? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            
        } while (continuar == 'S');

        // Calculamos el promedio evitando división por cero
        double promedioEdad = (cantidadPersonas > 0) ? ((double) sumaEdades / cantidadPersonas) : 0;

        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Cantidad de personas encuestadas: " + cantidadPersonas);
        System.out.printf("Promedio de edad: %.2f\n", promedioEdad);
        System.out.println("Edad mayor: " + edadMayor);
        System.out.println("Edad menor: " + edadMenor);
        System.out.println("Cantidad de mayores de edad (18 o más): " + mayoresDeEdad);

        scanner.close();
    }
}