public class Truck extends Vehicle {

    public double cargoCapacity;

    @Override
    void Start() {
        System.out.println("Truck is starting");
    }

    @Override
    void Stop() {
        System.out.println("Truck is stopping.");
    }
    
}