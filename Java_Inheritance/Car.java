

public class Car extends Vehicle{

    public int numDoors;

    @Override
    void Start() {
        System.out.println("Car is starting");
    }

    @Override
    void Stop() {
        System.out.println("Car is stopping.");
    }
}