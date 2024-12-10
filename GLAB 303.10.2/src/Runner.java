public class Runner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        // Example of Object type casting
        // declaration of object variable obj of the shape class
        // shape sObj; // object creation of the shape class
        Shape sObj = new Shape();
        sObj.displayshapName();
        System.out.println(sObj instanceof Shape); // true
        // obj creation of the circle class
        System.out.println("+++++++++");

        // it's fine because a circle is a shape by inheritance

        Shape shapeCircleObj = new Circle(100); // upCasting
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); // run circle's toString()
        // Use instanceOF operator for validation
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println(sObj instanceof Circle); // false because shape is not a Circle

        System.out.println("-----------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); // upCasting
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setWidth(2);
        shapeRectangleObj.setHeight(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj); // run Rectangle's toString
        // Use instanceOf operator for validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle); // false because Shape is not a Rectangle
        System.out.println("---------------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); // upCasting
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setBase(3);
        shapeTriangleObj.setHeight(2);
        System.out.println("Area of Triangle " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj); // Run Triangle toString()

        // Use instanceOf operator for validation
        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------------");

        Cylinder cylinderShape = new Cylinder(3); // upCasting
        cylinderShape.displayshapName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getArea());
        System.out.println(cylinderShape); // Run cylinderShape's toString


    }
}
