
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FabricaDeTrajes fabrica = new FabricaDeTrajes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            fabrica.escribirMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> fabrica.añadirComponenteAAlmacen();
                case 2 -> fabrica.listarComponentes();
                case 3 -> fabrica.añadirTrajeAAlmacen();
                case 4 -> fabrica.listarTrajes();
                case 5 -> fabrica.activarDesactivarRebajas();
                case 6 -> fabrica.crearEnvio();
                case 7 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);
    }
}