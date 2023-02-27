public class policy
{
   // fields
   private int policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // constructors
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
      int policyNumber1,
      String providerName1,
      String policyHolderFirstName1,
      String policyHolderLastName1,
      int age1,
      String smokingStatus1,
      double height1,
      double weight1
   ) 
   {
   policyNumber = policyNumber1;
   providerName = providerName1;
   policyHolderFirstName = policyHolderFirstName1;
   policyHolderLastName = policyHolderLastName1;
   age = age1;
   smokingStatus = smokingStatus1;
   height = height1;
   weight = weight1;
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
   /** 
   @param policyholder's first name
   @return policyholder's first name
   */
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
      public String setPolicyHolderFirstName(String policyHolderFirstName)
      {
         return policyHolderFirstName = policyHolderFirstName;
      }
      
   /** 
   @param policyholder's last name
   @return policyholder's last name
   */   
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
      public String setPolicyHolderLastName(String policyHolderLastName1)
      {
         return policyHolderLastName = policyHolderLastName1;
      }
      
   /** 
   @param age
   @return age
   */
   public int getAge()
   {
      return age;
   }
   
      public int setAge(int age1)
      {
         return age = age1;
      }
   
   /** 
   @param smoking status
   @return smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
      
      public String setSmokingStatus(String smokingStatus1)
      {
         return smokingStatus = smokingStatus1;
      }
   
   /** 
   @param height
   @return height
   */   
   public double getHeight()
   {
      return height;
   }
      
      public double setHeight(double height1)
      {
         return height = height1;
      }  

   /** 
   @param weight
   @return weight
   */
   public double getWeight()
   {
      return weight;
   }
      
      public double setWeight(double weight1)
      {
         return weight = weight1;
      }  
      
   // calculates policyholders BMI
   /** 
   @param weight and height
   @return calculated BMI
   */
   public double calculateBMI()
   {
      return (weight * 703) / (height * height);
   } 
   
   // calculates policy price
   /** 
   @param age, smoking status, and BMI
   @return calculated price
   */
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