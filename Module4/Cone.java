package Module4;

public class Cone extends Shape {
    private double height;
    private double radius;

    public Cone(double radius, double height) {
        this.height = height;
        this.radius= radius;

    }
    
    @Override
    public double surface_area() {
        double edgeHeight = Math.sqrt(Math.pow(radius, 2.0) + Math.pow(height, 2.0));
        return radius * (radius + edgeHeight) * Math.PI;
    }

    @Override
    public double volume() {
        return (1 / 3.0) * Math.PI * Math.pow(radius, 2.0) * height;
    }

    @Override
    public String toString() {
        return "Cone - SurfaceArea: " + surface_area() + ", Volume: " + volume();
    }

}
