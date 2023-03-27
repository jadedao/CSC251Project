public class policy
{
   // fields
   private int policyNumber;
   private String providerName;
      
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
   }
   
   // setters and getters
   
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