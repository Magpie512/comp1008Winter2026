package Hard.Three;

public class       Main {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar(120, 50, "Geese", 87);

        System.out.println("Speed: " + e.speed);
        System.out.println("Fuel: " + e.fuel);
        System.out.println("Make: " + e.make);
        System.out.println("Battery Level: " + e.batteryLevel);
    }
}
