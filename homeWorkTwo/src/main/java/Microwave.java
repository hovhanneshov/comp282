public class Microwave extends Device {
  public int maxTime;
  Microwave(int startPower, int maxCookingTime) {
    super(startPower);
    maxTime = maxCookingTime;
  }
}
