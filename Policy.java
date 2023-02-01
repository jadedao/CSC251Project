public class policy
{
   private int policyNumber;
   private string providerName;
   private string policyHolderFirstName;
   private string policyHolderLastName;
   private int age;
   private string smokingStatus;
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
      string providerName,
      string policyHolderFirstName,
      string policyHolderLastName,
      int age,
      string smokingStatus,
      int height,
      int weight,
   )
   
   public int getPolicyNumber() 
   {
      return policyNumber;
   }
   
      public void setPolicyNumber(int policyNumber)
      {
         return policyNumber = policyNumber;
      }
   
   public string getProviderName()
   {
      return providerName;
   }
   
      public void setProviderName(string providerName)
      {
         return providerName = providerName;
      }
   
   public string getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
      public void setPolicyHolderFirstName(string policyHolderFirstName)
      {
         return policyHolderFirstName = policyHolderFirstName;
      }
      
   public string getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
      public void setPolicyHolderLastName(string policyHolderLastName)
      {
         return policyHolderLastName = policyHolderLastName;
      }
   
   public int getAge()
   {
      return age;
   }
      
      public void setAge(int age)
      {
         return age = age;
      }
   
   public int getSmokingStatus()
   {
      return smokingStatus;
   }
      
      public void setSmokingStatus(string smokingStatus)
      {
         return smokingStatus = smokingStatus;
      
      
   public int getHeight()
   {
      return heigh;
   }
      
      public void setHeight(int height)
      {
         return height = height;
      }  

   public int getWeight()
   {
      return weigh;
   }
      
      public void setWeight(int weight)
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