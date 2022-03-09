/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");

        // System.out.printf("%+08d%n",-234);
        // System.out.printf("%+,08d%n",23450000);
        // System.out.printf("%+,d%n",23400);
        // System.out.printf("%-,8d%n",23450000);
        // System.out.printf("%+08.3f%n",3.14159);  //3141.142
        
        //for "%<var>d" or "%0<var>d" ->
        System.out.printf("%8d%n",234);         //.....234
        System.out.printf("%08d%n",234);        //00000234
        System.out.printf("%4d%n",2345);        //2345 
        System.out.printf("%04d%n",2345);       //2345
        
        //for "%+<var>d" or "%+0<var>d" ->
        System.out.printf("%+8d%n",234);        //....+234
        System.out.printf("%+08d%n",234);       //+0000234 
        System.out.printf("%+4d%n",2345);       //+2345 
        System.out.printf("%+04d%n",2345);      //+2345
        
        //for "%,<var>d" or "%,0<var>d" ->
        System.out.printf("%,8d%n",234500000);  //234,500,000
        System.out.printf("%,8d%n",2345);       //...2,345
        System.out.printf("%,08d%n",2345);      //0002,345
        System.out.printf("%+,8d%n",2345);      //..+2,345
        System.out.printf("%+,08d%n",2345);     //+002,345
        System.out.printf("%,4d%n",2345);       //2,345
        System.out.printf("%+,04d%n",2345);     //2,345
        
        //for "%.<var>f" or "%<var1>.<var2>f" ->
        System.out.printf("%.3f%n",3.14159);          //3.142
        System.out.printf("%8.3f%n",3.14159);         //...3.142
        System.out.printf("%08.3f%n",3.14159);        //0003.142
        System.out.printf("%1.3f%n",3.14159);         //3.142
        System.out.printf("%+8.3f%n",3.14159);        //..+3.142
        System.out.printf("%+08.3f%n",3.14159);       //+003.142
        System.out.printf("%+,8.3f%n",3456.14159);    //+3,456.142
        System.out.printf("%+,08.3f%n",3456.14159);   //+3,456.142
        System.out.printf("%+,011.3f%n",3456.14159);  //+03,456.142
	}
}
