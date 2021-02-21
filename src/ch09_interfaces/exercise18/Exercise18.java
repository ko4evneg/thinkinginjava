package ch09_interfaces.exercise18;
//Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for
//each type of Cycle, and code that uses these factories.

public class Exercise18 {
    static void rideVehicle(CycleFactory cycleFactory) {
        Cycle vehicle = cycleFactory.getCycle();
        vehicle.move();
    }

    public static void main(String[] args) {
        rideVehicle(new UnicycleFactory());
        rideVehicle(new BicycleFactory());
        rideVehicle(new TricycleFactory());
    }
}
