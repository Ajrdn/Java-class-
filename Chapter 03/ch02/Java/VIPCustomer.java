package ch02;

public class VIPCustomer extends Customer {
   
   private double saleRatio;
   public VIPCustomer(String name) {
      super(name);
      super.name = name;
      super.customerNumber = number++;
      super.grade = "platinum";
      super.bonusRatio = 0.05;
      
      this.saleRatio = 0.1;
   }
   @Override
   public int calcPrice(int price) {
      bonusPoint = (int) (price * bonusRatio);
      return price - (int) (price*saleRatio);
   }
   
   
}