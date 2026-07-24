class Car {
    void start() {
        System.out.println("Car starts");
    }
}
class SportsCar extends Car {

    @Override
    void start() {
        System.out.println("Sai car starts loudly");
    }

    void loudly() {
        System.out.println("Balu Loud engine sound.");
    }
    }

public class Main {
    public static void main(String[] args) {
        SportsCar lambo = new SportsCar();

        lambo.start();   // Calls the overridden method
        lambo.loudly();  // Calls SportsCar-specific method
    }
}