/*package whatever //do not write package name here */

import java.io.*;

class Person{
    private int age;          //data member private krne se access nhi hoga bahr(other class)
    
    private Person(int age){  //private constructor -> cant access to other class
        this.age = age;
    }
    
    private int getAge(){   //private methods -> cant access to other class
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){           //used to give information about class 
        return "Person's age = "+age;
    }
}
class Test{
	public static void main (String[] args) {
        Person p = new Person(10);
        //System.out.println(p.age);    //cant access due to private field age
        System.out.println(p.getAge()); //10
        System.out.println(p);          //Person's age = 10
	}
}
