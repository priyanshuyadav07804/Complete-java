// Create a class Marks:-
  
// contains the data members id of int data type, javaMarks, cMarks and cppMarks of float data type
// write a method setMarks() to initialize the data members
// write a method displayMarks() which will display the given data

// Create another class Result which is derived from the class Marks:-
  
// contains the data members total and avg of float data type
// write a method compute() to find total and average of the given marks
// write a method showResult() which will display the total and avg marks
// Write a class SingleInheritanceDemo with main() method it receives four arguments as id, javaMarks, cMarks and cppMarks.

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Result r = new Result();
        r.setMarks();
        r.compute();
        r.displayMarks();
        r.showResult();
	}
}
class Marks{
    Scanner sc = new Scanner(System.in);
    int id;
    float javaMark;
    float cMark;
    float cppMark;
    public void setMarks(){
        id =  sc.nextInt();
        javaMark = sc.nextFloat();
        cMark = sc.nextFloat();
        cppMark = sc.nextFloat();
    }
    public void displayMarks(){
        System.out.println("Id : "+ id);
        System.out.println("Java mark : "+ javaMark);
        System.out.println("C mark : "+ cMark);
        System.out.println("CPP mark : "+ cppMark);
    }
}
class Result extends Marks{
    float total;
    float avg;
    public void compute(){
        total = javaMark + cMark +cppMark ;
        avg = total/3;
    }
    public void showResult(){
        System.out.println("Total : "+ total);
        System.out.println("Avg : "+ avg);
    }
}
