/*package whatever //do not write package name here */

import java.io.*;

class Person{
    private int age;          //data member private krne se access nhi hoga bahr
    
    private Person(int age){  //constructor private hone se kuch nhi hota h.
        this.age = age;
    }
    
    private int getAge(){   //methods private karne se kuch nhi hota h
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){           //used to give information about class 
        return "Person's age = "+age;
    }
    
	public static void main (String[] args) {
        Person p = new Person(10);
        //System.out.println(p.age);    //cant access due to private field age
        System.out.println(p.getAge()); //10
        System.out.println(p);          //Person's age = 10
	}
}
