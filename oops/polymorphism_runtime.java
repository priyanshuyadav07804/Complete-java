//polymorphism only work on method overriding in this child method is called not parant method.
class A{
    void getname(){
        System.out.println("A");
    }
}
class B extends A{
    void getname(){
        System.out.println("B");
    }
} 
// class C extends B{
//     void getname(){
//         System.out.println("C");
//     }
// }
public class Test{
    public static void main(String[] args){
        A a = new A();
        A b = new B();  //b is referance of type class A and b is object of class B
                        //b holds address of class B.
        b.getname();    //according to IMPORTANT is should A but here JVM does not
                        // call the method declared in type(class A) of referance(b)
                        //but it will look for implimentation in object whose address
                        //is hold by the referance(b)
    }
}
