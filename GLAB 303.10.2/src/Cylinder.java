public class Cylinder extends Circle{
    private final double PI = Math.PI;

    public Cylinder(double radius, double height) {
        super(radius, height);
    }
    public Cylinder(double radius) {
        super(radius);
    }
    // Returns the volume of this cylinder
    public double getVolume() {
        return (PI*Math.pow(super.radius, 2)) * super.height;
    }
    public double getSurfaceArea() {
        return 2.0 * Math.PI * super.radius * super.height;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    public String toString(){
        return "Radius: " + super.radius + " Height: " + super.height;
    }
}
