package Module4;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }

    @Override
    public String toString() {
        return "Sphere - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}
