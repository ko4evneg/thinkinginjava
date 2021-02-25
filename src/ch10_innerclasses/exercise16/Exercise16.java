package ch10_innerclasses.exercise16;
//Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for
//each type of Cycle, and code that uses these factories.

//Exercise 16: (1) Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.

public class Exercise16 {
    static void rideVehicle(CycleFactory cycleFactory) {
        Cycle vehicle = cycleFactory.getCycle();
        vehicle.move();
    }

    public static void main(String[] args) {
        rideVehicle(new CycleFactory() {
            @Override
            public Cycle getCycle() {
                return new Unicycle();
            }
        });
        rideVehicle(new CycleFactory(){
            @Override
            public Cycle getCycle() {
                return new Bicycle();
            }
        });
        rideVehicle(new CycleFactory(){
            @Override
            public Cycle getCycle() {
                return new Tricycle();
            }
        });
    }
}
