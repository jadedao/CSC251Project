import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Scanner;

public class Project_thuy_dao {

   public static void main (String[] args) {
   
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

        PolicyHolder policyHolder = new PolicyHolder(policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);
        policy policy = new policy(policyNumber, providerName, policyHolder); 
         System.out.println();
         System.out.println(policy);
         System.out.println(policyHolder.toString);


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

        policy policy = new policy();

        System.out.println();
        policy.getPolicyCounter();
        System.out.println("Number of smokers: " + smokerCount);
        System.out.println("Number of non-smokers: " + nonSmokerCount);
    }
   
}