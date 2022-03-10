// Write a class ReverseString with a main method. The method receives one command line argument. Write a logic to reverse it and print the output.

// For Example:
// Cmd Args : Ram lakshman
// namhskal maR

public class ReverseString{
    public static void main(String[] args){
        String s = "priyanshu yadav";
        String rev = "";                //Empty String
        String arr[] = s.split("");
        int len = arr.length;
        for(int j = len-1; j>=0; j--){
            rev += arr[j];
        }
        System.out.println("revstring is : "+rev);
    }
}
