public class policy
{
   // fields
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCounter = 0;
      
   // constructors
   public policy()
   {
      policyNumber = 0;
      providerName = "";
   }
   
   public policy(
      int policyNumber1,
      String providerName1,
   ) 
   {
   policyNumber = policyNumber1;
   providerName = providerName1;
   policyHolder = new PolicyHolder();
   policyCounter++;
   }
   
   // setters and getters
   
   /** 
   @return policy number and provider name
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber + "\nProvider Name: " + providerName);
   }
   
   /** 
   @return number of policy objects
   */
   public static void getPolicyCounter()
   {
      System.out.println("There were " + policyCounter + " Policy objects created.");
   }
   
   /** 
   @param policy number
   @return policy number
   */
   public int getPolicyNumber() 
   {
      return policyNumber;
   }
   
      public int setPolicyNumber(int policyNumber)
      {
         return policyNumber = policyNumber;
      }
      
   /** 
   @param provider name
   @return provider name
   */  
   public String getProviderName()
   {
      return providerName;
   }
   
      public String setProviderName(String providerName)
      {
         return providerName = providerName;
      }
         
}