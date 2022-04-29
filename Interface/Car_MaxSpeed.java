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
