public class Microwave extends Device {
  public int maxTime;
  
  public Microwave(int startPower, int maxCookingTime) {
    super(startPower);
    maxTime = maxCookingTime;
  }
}
