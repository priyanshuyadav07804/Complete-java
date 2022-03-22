/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		StringBuilder sb = new StringBuilder("ganga");
		sb.append("river");
		System.out.println(sb);   //gangariver
		
		sb.insert(5,"isholy");
		System.out.println(sb);   //gangaisholyriver
        
        sb.replace(0,5,"yamuna");
		System.out.println(sb);       //yamunaisriver
		
// 		insert(<index at which char insert>,<char array>,< index of char arr, from which char will insert>,<no of char to be insert>) )
		char[] ch = {'h','o','l','y'};
		sb.insert(8,ch,0,3);
		System.out.println(sb); //yamunaisholriver
		
		sb.delete(8,11);
		System.out.println(sb);  //yamunaisriver
		

		
		
		

		
	}
	
}
