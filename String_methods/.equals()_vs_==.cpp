//<str>.equals(<str>)-> check content
//<str> == <str> -> check address

import java.io.*;

class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        String a = "b";
        String b = "b";
    
        String c = new String("c");
        String d = new String("c");
    
        String e = "b";
        String f = new String("b");
        
        System.out.println("b"=="b");   //true
        System.out.println(a==b);       //true
        System.out.println(c==d);       //false
        System.out.println(e==f);       //false
            
	}
}
