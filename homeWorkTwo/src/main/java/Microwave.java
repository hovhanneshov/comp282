public class Microwave extends Device {
  public int maxTime;
  
  public Microwave(int startPower, int maxCookingTime) { // Exercise 4
    super(startPower);
    maxTime = maxCookingTime;
  }

  // Exercise 6
  @Override
  public void printDescription() {
    super.printDescription();
    System.out.println("Max cooking time: " + maxTime);
  }

  // Exeercise 8
  public void heatFood() {
    System.out.println("Food is heating.");
  }
}
