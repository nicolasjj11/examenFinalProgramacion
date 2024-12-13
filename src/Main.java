import management.*;
import utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        System.out.println("3. Estadísticas Simples");
        System.out.println("4. Salir");

        AgenteManager agenteManager = new AgenteManager();
        AnomaliaManager anomaliaManager = new AnomaliaManager();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Píldora Roja: Agentes de la Resistencia");
            System.out.println("2. Píldora Azul: Control de Anomalías");
            System.out.println("3. Estadísticas Simples");
            System.out.println("4. Salir");

            int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1, 2, 3 o 4): ");

            switch (opcion) {
                case 1:
                    agenteManager.mostrarMenu();
                    break;
                case 2:
                    anomaliaManager.mostrarMenu();
                    break;
                case 3:
                    // Mostrar estadísticas
                    System.out.println("=== Estadísticas Simples ===");
                    System.out.println("Total de Agentes: " + agenteManager.contarAgentes());
                    System.out.println("Total de Anomalías: " + anomaliaManager.contarAnomalias());
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}