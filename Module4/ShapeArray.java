package Module4;

public class ShapeArray {
    public static void main(String[] args) {
        Sphere testSphere = new Sphere(10.0);
        Cylinder testCylinder = new Cylinder(6.0, 10.0);
        Cone testCone = new Cone((4.0), 7.0);

        Shape[] shapeArray = {testSphere, testCylinder, testCone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
