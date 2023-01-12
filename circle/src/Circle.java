public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle" +
                "radius = " + radius +
                ", color = " + color + ", Area: " + getArea();
    }
}