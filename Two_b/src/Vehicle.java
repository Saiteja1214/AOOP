import java.util.Scanner;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a bike.");
    }
}

class Scooter implements Vehicle {
    public void drive() {
        System.out.println("Riding a scooter.");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type.equals("Car")) {
            return new Car();
        } else if (type.equals("Bike")) {
            return new Bike();
        } else if (type.equals("Scooter")) {
            return new Scooter();
        }
        return null;
    }
}

