import java.util.Scanner;

public class Project_thuy_dao {

   public static void main (String[] args) {
   
   int policyNumber;
   String providerName;
   String policyholderFirstName;
   String policyholderLastName;
   int policyholderAge;
   String policyholderSmokingStatus;
   double policyholderHeight;
   double policyholderWeight;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Please Enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
   System.out.println("Please Enter the Provider Name: ");
      providerName = keyboard.nextLine();
   
   System.out.println("Please Enter the Policyholder's First Name: ");
      policyholderFirstName = keyboard.nextLine();
   
   System.out.println("Please Enter the Policyholder's Last Name: ");
      policyholderLastName = keyboard.nextLine();
      
   System.out.println("Please Enter the Policyholder's Age: ");
      policyholderAge = keyboard.nextInt();
      keyboard.nextLine();
      
   System.out.println("Please Enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyholderSmokingStatus = keyboard.nextLine();
      
   System.out.println("Please Enter the Policyholder's Height (in inches): ");
      policyholderHeight = keyboard.nextDouble();
      
   System.out.println("Please Enter the Policyholder's Weight (in pounds): ");
      policyholderWeight = keyboard.nextDouble();
      
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
   
   }
}