package Hard.Three;

public class Car extends Vehicle{
    String make;

    Car(int fuel,int speed, String make){
        super(speed,fuel);
        this.make = make;
    }
}
