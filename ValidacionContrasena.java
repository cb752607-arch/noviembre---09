import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "Java2026";
        String contrasenaIngresada;

        do {
            System.out.print("Ingrese contraseña: ");
            contrasenaIngresada = scanner.nextLine();

            if (!contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }
        } while (!contrasenaIngresada.equals(contrasenaCorrecta));

        System.out.println("Acceso permitido");
        scanner.close();
    }
}