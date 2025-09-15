package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {

  public boolean isDivisible(int a, int b){
    if(b == 0)
      return false;
    else if(a % b == 0)
      return true;
    else
      return false;
  }
}
