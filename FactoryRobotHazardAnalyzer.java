import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        System.out.println("Factory Robot Hazard Analyzer");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Arm Precision (0.0-1.0): ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density (1-20): ");
        int workerDensity = scanner.nextInt();

        System.out.print("Enter Machinery State (Worn, Faulty, Critical): ");
        String machineryState = scanner.next();

        System.out.println("\n--- Inputs ---");
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        try {
            RobotHazardAuditor auditor = new RobotHazardAuditor();
            double hazardRisk = auditor.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Hazard Risk Score: " + hazardRisk);
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}