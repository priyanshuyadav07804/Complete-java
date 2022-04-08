class A{
    private int a = 10;
    public int getA(){
        return a;
    }
}
class B extends A{
    private int b = 20;
    public int getB(){
        return b;
    }
}
public class Test{
    public static void main(String[] args){
        A a1 = new B();  //valid Bcoz the subclass instance can be referred by the base class reference.
        System.out.println("value of a = "+a1.getA());
        //System.out.println("value of b = "+a1.getB()); //compilation error coz reference a1 is of type class A does not know members declared in its subclass B
    }
}
