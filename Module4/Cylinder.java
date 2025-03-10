package Module4;
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
        
    }

    @Override
    public double surface_area() {
        return 2.0 * Math.PI * radius * (height + radius);
    }

    @Override public double volume() {
        return Math.pow(radius, 2.0) * height;

    }

    @Override
    public String toString() {
        return "Cylinder - Surface Area: " + surface_area() + " Volume: " + volume();
    }
}
