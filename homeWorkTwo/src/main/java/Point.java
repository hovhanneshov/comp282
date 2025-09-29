public class Point {
    public int x = 0;
    public int y = 0;

    // Default Constructor (Exercise 3 modification needed here)
    public Point() {
        // Automatically provided if none defined
        this.x = 0;
        this.y = 0;
    }

    // Two-argument constructor
    public Point(int x, int y) {
        // Shadowing resolution used here
        this.x = x;
        this.y = y;
    }

    // One-argument constructor
    public Point(int size) {
        this.x = size;
        this.y = size;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void printState() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

}
