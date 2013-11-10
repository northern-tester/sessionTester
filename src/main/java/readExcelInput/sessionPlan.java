package readExcelInput;

public class sessionPlan
{
  public sessionPlan(String planLocation, String planFileName) {
      this.planLocation = planLocation;
      this.planFileName = planFileName;   
}
  public String getPlanLocation(){
    return this.planLocation;
}
  public String getPlanFileName(){
    return this.planFileName;
} 
    
private String planLocation;
private String planFileName;

}