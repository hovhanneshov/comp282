public class Microwave extends Device {
  public int maxTime;
  
  public Microwave(int startPower, int maxCookingTime) { // Exercise 4
    super(startPower);
    maxTime = maxCookingTime;
  }
}
