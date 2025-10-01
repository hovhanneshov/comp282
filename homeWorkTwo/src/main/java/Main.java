public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for(int i = 0; i < points.length; i++) {
            sum += points[i].x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // --- Implement all exercises here ---
        System.out.println("Hello World!");

        // Exercise 1
        Point startPoint;
        startPoint = new Point(10, 20);
        System.out.println(startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();

        // Exercise 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue); // The original value stays the same as an int because despite having inserted originalValue into the parameters, the only thing being passed is the int value. Primitive types are always passed by value in Java, and cannot be edited as a parameter.
        // DO THE EXERCISE 2 CHALLENGE HERE

        // Exercise 3
        Point blank = new Point();
        System.out.println(blank.x + ", " + blank.y);

        // Exercise 5
        int sum1 = sumCoordinates(new Point(0,0), new Point(1,0), new Point(1,1));
        System.out.println(sum1);
        Point[] points = {new Point(0,0), new Point(1,0), new Point(1,1)};
        int sum2 = sumCoordinates(points);

        // Exercise 7
        Device d1 = new Device(1);
        Microwave m1 = new Microwave(2, 1);
        Device polyDevice;
        polyDevice = (Device)m1;
        polyDevice.printDescription(); // polyDevice is printed as a device due to the runtime polyDevice being treated as a Device object


    }

}
