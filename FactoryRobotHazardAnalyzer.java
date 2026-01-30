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

        // UC4: Input Validation
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.p
                intln("Error: Arm precis
                on must be 0.0-1.0");
        } else if (workerD
                nsity < 1 || workerDensi
                y > 20) {
            System.out.print
                n("Error: Worker density
                must be 1-20");
        } else if (!machineryState.equals("Worn") && !machineryState.equals("Faulty") && !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
        } else {
            // UC3: Hazard Calculation
            double machineRiskFactor = 0.0;
            switch (machineryState) {
                case "Worn": machineRiskFactor = 1.3; break;
                case "Faulty": machineRiskFactor = 2.0; break;
                case "Critical": machineRiskFactor = 3.0; break;
            }

            double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
            System.out.println("Hazard Risk Score: " + hazardRisk);
        }

        scanner.close();
    }
}