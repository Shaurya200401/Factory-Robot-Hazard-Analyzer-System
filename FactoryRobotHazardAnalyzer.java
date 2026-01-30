import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
 

        System.out.print("Enter Worker Density (1-20): ");
        int workerDensity = scanner.nextInt();

        System.out.print("Enter Machinery State (Worn, Faulty, Critical): ");
        String machineryState = scanner.next();

        System.out.println("\n--- Inputs ---");
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        scanner.close();
    }
}