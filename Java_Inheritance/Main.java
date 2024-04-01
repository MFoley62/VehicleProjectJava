public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        car.numDoors = 4;

        Vehicle carPref = new Car();
        carPref.brand = "Renault";
        carPref.model = "Clio";
        carPref.year = 2020;

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.hasSideCar = true;

        Vehicle motorcyclePref = new Motorcycle();
        motorcyclePref.brand = "Kuba";
        motorcyclePref.model = "Supra";
        motorcyclePref.year = 2012;

        Truck truck = new Truck();
        truck.cargoCapacity = 200.75d;

        Vehicle truckPref = new Truck();
        truckPref.brand = "Scania";
        truckPref.model = "XXL";
        truckPref.year = 2023;

        System.out.println(carPref.year + " model " + carPref.brand + " " + carPref.model + " nun " + car.numDoors + "adet kapısı vardır.");
        System.out.println(motorcyclePref.year + " model " + motorcyclePref.brand + " " + motorcyclePref.model + " " + "yan kasaya sahip mi ?" + motorcycle.hasSideCar );
        System.out.println(truckPref.year + " model " + truckPref.brand + " " + truckPref.model + " nun "+ " kargo kapasitesi " + truck.cargoCapacity);


        
    }
}