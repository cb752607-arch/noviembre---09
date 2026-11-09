import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montoTotalVendido = 0;
        int cantidadTotalProductos = 0;
        int contadorVentas = 0;
        char continuar;

        do {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();

            double subtotal = precio * cantidad;
            montoTotalVendido += subtotal;
            cantidadTotalProductos += cantidad;
            contadorVentas++;

            System.out.print("¿Desea seguir registrando ventas? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        double promedioVenta = (contadorVentas > 0) ? (montoTotalVendido / contadorVentas) : 0;

        System.out.println("\n--- Resumen de Ventas ---");
        System.out.println("Monto total vendido: S/ " + montoTotalVendido);
        System.out.println("Cantidad total de productos vendidos: " + cantidadTotalProductos);
        System.out.printf("Promedio de venta por producto: S/ %.2f\n", promedioVenta);

        scanner.close();
    }
}