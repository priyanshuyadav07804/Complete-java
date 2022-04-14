class A{
    public int a = 10;
    public int getA(){    //method 1
        return a;
    }
}
class B extends A{
    private int b = 20;
    public int getB(){
        return b;
    }
    public int getA(){     //overrides method 1 of parant class
        return 2*a;
    }
}
public class test{
    public static void main(String[] args){
        B b1 = new B();
        System.out.println(b1.getA());
        System.out.println(b1.getB());
        
        A a1 = new A();
        System.out.println(a1.getA());
        // System.out.println(a1.getB());   //error coz referance a1 is of type class A does not knoe getB() method of class B   
        
        A a2 = new B();
        System.out.println(a2.getA());
        // System.out.println(a2.getB());   //error coz referance a2 is of type class A does not know getB() method of class B

    }
} 
