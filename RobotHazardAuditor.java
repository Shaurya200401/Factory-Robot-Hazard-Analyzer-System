public class RobotHazardAuditor {
    public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) {
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return -1.0; // Indicate error
        }
        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            return -1.0;
        }
        if (!machineryState.equals("Worn") && !machineryState.equals("Faulty") && !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
            return -1.0;
        }

        double machineRiskFactor = 0.0;
        switch (machineryState) {
            case "Worn":
                machineRiskFactor = 1.3;
                break;
            case "Faulty":
                machineRiskFactor = 2.0;
                break;
            case "Critical":
                machineRiskFactor = 3.0;
                break;
        }

        return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
    }
}
