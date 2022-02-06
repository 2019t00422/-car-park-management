package carpark;

public class Vehicle {
   private String VNumber; // vehicle number plate
   private String VName;   // vehicle oner name
   private String VType;   // vehicle type car or bicle
   private String JobPosition;   //teacher student

   public Vehicle() {
      this.VName = VName;
      this.VNumber = VNumber;
      this.VType = VType;
      this.JobPosition = JobPosition;
   }

   //setters
   public void setVName(String VName) {
      this.VName = VName;
   }
   public void setVNumber(String VNumber) {
      this.VNumber = VNumber;
   }
   public void setVType(String VType) {
      this.VType = VType;
   }
   public void setJobPosition(String JobPosition) {
      this.JobPosition = JobPosition;
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
   public String getJobPosition() {
      return JobPosition;
   }


}
