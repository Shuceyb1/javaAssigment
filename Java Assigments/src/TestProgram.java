// Colorable interface
interface Colorable {
    void howToColor();
}

// GeometricObject class
class GeometricObject {
    private String color;

    public GeometricObject() {
        this.color = "white";
    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        // Implementation of area calculation
        return 0.0; // Placeholder value, actual implementation depends on the subclass
    }
}

// Square class
class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// Test program
public class TestProgram {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5);
        objects[1] = new Square(3);
        objects[2] = new GeometricObject();
        objects[3] = new Square(7);
        objects[4] = new GeometricObject("red");

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}