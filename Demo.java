import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Scanner; 

public class Demo {
    public static void main(String[] args) {
        ArrayList<policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("policyInformation.txt");
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);

            int lineNumber = 0;

while (scanner.hasNextLine()) {
    lineNumber++;
    String line = scanner.nextLine();
    String[] values = line.split(",\\s*"); // split values by comma and optional space

    if (values.length != 8) {
        System.out.println("Invalid input on line " + lineNumber + ": " + line);
        continue; // skip to the next line
    }

    try {
        int policyNumber = Integer.parseInt(values[0]);
        String providerName = values[1];
        String policyholderFirstName = values[2];
        String policyholderLastName = values[3];
        int policyholderAge = Integer.parseInt(values[4]);
        String policyholderSmokingStatus = values[5];
        double policyholderHeight = Double.parseDouble(values[6]);
        double policyholderWeight = Double.parseDouble(values[7]);

        policy policy = new policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight); 
         System.out.println();
         System.out.println("Policy number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());


        if (policyholderSmokingStatus.equals("smoker")) {
            smokerCount++;
        } else {
            nonSmokerCount++;
        }
        
    } catch (NumberFormatException e) {
        System.out.println("Invalid input on line " + lineNumber + ": " + line);
        continue; // skip to the next line
    }
}

            scanner.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println();
        System.out.println("Number of smokers: " + smokerCount);
        System.out.println("Number of non-smokers: " + nonSmokerCount);
    }
}
