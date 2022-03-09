// The method receives one command line argument and print the first half of the argument.

// Here is an example:
// Cmd Args : Eight
// Ei


import java.io.*;

class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        String a = "Apple";  //for 5 char it will print 2 char
        int i = a.length()/2;
        System.out.println(a.substring(0,i));
	}
}
