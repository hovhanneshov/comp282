public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        return 0;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---
        System.out.println("Hello World!");
        
        Point startPoint;
        startPoint = Point(10, 20);
        System.out.println(startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();

        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue); // The original value stays the same as an int because despite having inserted originalValue into the parameters, the only thing being passed is the int value. Primitive types are always passed by value in Java, and cannot be edited as a parameter.

    }

}
