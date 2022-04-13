/*we should always remember that when we create an object of child class,
parant constructor is executed first and then child constructor is executed.*/

/* when we create object of child class then "new" keyword call child constructor 
and this call implicitly call parant constructor ,if we do not expicitly write code 
to call parant constuctor*/

/*
suppose we do not write code to call parant constructor in child constructor
then compiler implicitly adds "super()" as first line of child constructor that 
will call default constructor of parant class.if parant doesnot have default 
constructor then we should explicitly call parametrized constructor else
compiler give error and say->"no default constructor found in parant class"
*/


class A{
//     public A(){
//         System.out.println("This is parant constuctor : ");
//     }
    public A(int x){
        System.out.println("parant is "+x);
    }
}
class B extends A{
    public B(){
        super(5);               //we must write this if no default constructor is present in A otherwise error will occure
        System.out.println("This is child constructor : ");
    }
}
public class Test{
    public static void main(String[] args){
        B b = new B();
    }
} 
