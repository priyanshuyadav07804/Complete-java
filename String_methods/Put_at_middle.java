// Write a class PutInsideTag with a main method. The method receives two command line arguments. First one is a tag like '[]' or '{{{}}}' etc. The second argument is a string. Write logic to print a new word where the second argument is kept exactly in the middle of the tag.

// For example:
// Cmd Args : {{{{}}}} Hyderabad
// {{{{Hyderabad}}}}

import java.io.*;

public class PutInsideTag{
    public static void main(String[] args){
        String s1 = "{{{{}}}}";
        String s2 = "delhi";
        int middleidx = s1.length()/2;
        String begmid = s1.substring(0,middleidx);        // substring upto middle
        String midlast = s1.substring(middleidx,s1.length()); //substring middle to last
        System.out.println(begmid+s2+midlast);
    }
}

