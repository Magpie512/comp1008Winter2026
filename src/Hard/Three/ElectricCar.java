package Hard.Three;

public class ElectricCar extends Car{
    int batteryLevel;

    ElectricCar(int speed,int fuel,String make,int batteryLevel){
        super(speed,fuel,make);
        this.batteryLevel = batteryLevel;

    }
}
