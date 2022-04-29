
/*Create an interface called Car with two abstract methods String getName(), int getMaxSpeed().one default method void applyBreak() with code snippet
System.out.println("Applying break on " + getName());

A static method "Car getFastestCar(Car car1, Car car2)" which returns car1 if the maxSpeed of car1 is greater than or equal to that of car2, else return car2.

Create a class called BMW which implements the interface Car and provides the implementation for the abstract methods getName() and getMaxSpeed().
create a class called Audi which implements the interface Car and provides the implementation for the abstract methods getName() and getMaxSpeed().

Create a public class called MainApp with the main() method.
Take the input from the command line arguments. Create objects for the classes BMW and Audi then print the fastest car.*/

public class Test{
    public static void main(String[] args){
        BMW b = new BMW("BMW",200);
        Audi a = new Audi("Audi",150);
        System.out.println("Fastest car is : "+Car.getFastCar(b,a).getName());
    }
}
interface Car{
    String getName();
    int getMaxSpeed();
    default void applyBreak(){
        System.out.println("Applying break on " + getName());
    }
    static Car getFastCar(Car c1, Car c2){
        if(c1.getMaxSpeed()>c2.getMaxSpeed()){
            return c1;
        }
        return c2;
    }
}

class BMW implements Car{
    int speed;
    String name;
    BMW(String n,int s){
        name = n;
        speed = s;
    }
    public int getMaxSpeed(){
        return speed;
    }
    public String getName(){
        return name;
    }
}
class Audi implements Car{
    int speed;
    String name;
    Audi(String n,int s){
        name = n;
        speed = s;
    }
    public int getMaxSpeed(){
        return speed;
    }
    public String getName(){
        return name;
    }
}
