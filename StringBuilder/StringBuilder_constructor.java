//  Java code to illustrate StringBuilder
/* 
StringBuilder(): Constructs a string builder with no characters in it and an
    initial capacity of 16 characters.
 
StringBuilder(int capacity): Constructs a string builder with no characters in
    it and an initial capacity specified by the capacity argument.
 
StringBuilder(CharSequence seq): Constructs a string builder that contains the
    same characters as the specified CharSequence.
 
StringBuilder(String str): Constructs a string builder initialized to the content
    of the specified string. 
*/
import java.util.*;
public class GFG1 {
	public static void main(String[] argv){

		// create a StringBuilder object
		// using StringBuilder() constructor
	    StringBuilder str = new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = "+ str);

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1);

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = "+ str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1);

		// print string
		System.out.println("String3 = " + str3);
	}
}
