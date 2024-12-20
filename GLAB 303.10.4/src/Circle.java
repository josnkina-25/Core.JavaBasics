public class Circle extends Shape implements Movable{
    protected double radius;
    private int x,y;  // x and y coordinates of the point
    private final double PI = Math.PI;

    /** Constructs a MovablePoint instance at the given x and y */
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        // double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return 0; // reference to parent class variable
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a circle of radius " + this.radius);
    }
/** Returns a self-descriptive string */
    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + ", " + y + ")";
    }
}
