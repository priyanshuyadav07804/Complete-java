class A{
    int num;
    A(int value){
        num = value;
    }
    public void print(){
        System.out.println("This is parant method : ");
    }
}
class B extends A{
    int num;
    B(int value){
        super(value);
        num = value + 5;
        System.out.println("parant num = "+super.num);
        System.out.println("child num = "+num);
    }
    public void print(){
        super.print();
        System.out.println("This is child method : ");
    }
}
public class Test{
    public static void main(String[] args){
        B b = new B(10);
        b.print();
    }
}
