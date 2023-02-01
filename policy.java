public class policy
{
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int age;
   private String smokingStatus;
   private int height;
   private int weight;
   
   public policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolderFirstName = "";
      policyHolderLastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   public policy(
      int policyNumber,
      String providerName,
      String policyHolderFirstName,
      String policyHolderLastName,
      int age,
      String smokingStatus,
      int height,
      int weight
   ) 
   {
   policyNumber = policyNumber;
   providerName = providerName;
   policyHolderFirstName = policyHolderFirstName;
   policyHolderLastName = policyHolderLastName;
   age = age;
   smokingStatus = smokingStatus;
   height = height;
   weight = weight;
   }
   
   public int getPolicyNumber() 
   {
      return policyNumber;
   }
   
      public int setPolicyNumber(int policyNumber)
      {
         return policyNumber = policyNumber;
      }
   
   public String getProviderName()
   {
      return providerName;
   }
   
      public String setProviderName(String providerName)
      {
         return providerName = providerName;
      }
   
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
      public String setPolicyHolderFirstName(String policyHolderFirstName)
      {
         return policyHolderFirstName = policyHolderFirstName;
      }
      
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
      public String setPolicyHolderLastName(String policyHolderLastName)
      {
         return policyHolderLastName = policyHolderLastName;
      }
   
   public int getAge()
   {
      return age;
   }
      
      public int setAge(int age)
      {
         return age = age;
      }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
      
      public String setSmokingStatus(String smokingStatus)
      {
         return smokingStatus = smokingStatus;
      }
      
   public int getHeight()
   {
      return height;
   }
      
      public int setHeight(int height)
      {
         return height = height;
      }  

   public int getWeight()
   {
      return weight;
   }
      
      public int setWeight(int weight)
      {
         return weight = weight;
      }  
   
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   } 
   
   public double calculatePrice()
   {
      double price = 600;
      
      if (age > 50) 
      {
         price += 75;
      }
      
      if (smokingStatus == "smoker")
      {
         price += 100;
      }
      
      double BMI = calculateBMI();
      if (BMI > 35)
      {
         price += ((BMI - 35) * 20);
      }
      
      return price;
   }
     
}