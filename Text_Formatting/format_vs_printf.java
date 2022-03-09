import java.io.*;

class GFG {
	public static void main (String[] args) {

        String name = "abc";
        System.out.format("name = %s%n",name);
        
        int age = 24;
        // float fee = 59.50;  //it is double value not float bcoz of two precision 
        float fee = 59.50f;
        System.out.format("age = %d , and fee = %f%n",age,fee);
        
        System.out.printf("Name = %s , age = %d and fee = %f",name,age,fee);
	}
}
