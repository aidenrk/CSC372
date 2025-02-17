class Vehicle {
    String name;
    void isAVehicle() {
        System.out.println(name + " is indeed a vehicle");
    }
}

class Motorcycle extends Vehicle {
    void numberOfTires() {
        System.out.println(name + " has 2 tires.");
    }
}

public class InheritanceExample{
    public static void main(String[] args) {
        Motorcycle bmw = new Motorcycle();
        bmw.name = "BMWS1000RR";
        bmw.isAVehicle();
        bmw.numberOfTires();
    }
}