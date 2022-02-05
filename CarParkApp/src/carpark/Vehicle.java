package carpark;

public class Vehicle {
   private String VNumber;
   private String VName;
   private String VType;

   public Vehicle() {
      this.VName = VName;
      this.VNumber = VNumber;
      this.VType = VType;
   }

   //getters
   public String getVName() {
      return VName;
   }

   public String getVNumber() {
      return VNumber;
   }

   public String getVType() {
      return VType;
   }

   //setters
   public void setVName(String VName) {
      this.VName = VName;
   }

   public void setVNumber(String VNumber) {
      this.VNumber = VNumber;
   }
   public void setVType(String VType) {
      this.VNumber = VType;
   }
}
