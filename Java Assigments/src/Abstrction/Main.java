package Abstrction;

interface Colorable {
    void howToColor();
}

abstract class GeometricObject {
    abstract double getArea();
}

class Square extends GeometricObject implements Colorable {
    private double side;

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
    double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

public class Main {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(2.5);
        objects[1] = new Square(4.0);
        objects[2] = new Square(3.0);
        objects[3] = new Square(5.5);
        objects[4] = new Square(6.2);

        for (GeometricObject object : objects) {
            System.out.println("Area: " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}