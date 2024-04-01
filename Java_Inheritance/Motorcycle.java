

public class Motorcycle extends Vehicle{

    public boolean hasSideCar;

    @Override
    void Start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    void Stop() {
        System.out.println("Motorcycle is stopping.");
    }

}