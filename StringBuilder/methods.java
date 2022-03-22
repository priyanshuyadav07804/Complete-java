import java.io.*;
class GFG {
	public static void main (String[] args) {
		StringBuilder sb = new StringBuilder("ganga");
		sb.append("river");
		System.out.println(sb);   //gangariver
		
		sb.insert(5,"isholy");
		System.out.println(sb);   //gangaisholyriver
		
		sb.delete(7,11);
		System.out.println(sb);  //gangaisriver
        
        sb.replace(0,5,"yamuna");
		System.out.println(sb);       //yamunaisriver
		
// 		insert(<index at which char insert>,<char array>,< index of char arr, from which char will insert>,<no of char to be insert>) )
		char[] ch = {'h','o','l','y'};
		sb.insert(8,ch,0,3);
		System.out.println(sb); //yamunaisholriver
		
		sb.delete(8,11);
		System.out.println(sb);  //yamunaisriver
		
		sb.reverse();
		System.out.println(sb);  //revirsianumay
        
        StringBuilder sp2 = new StringBuilder("Hi! Good Morning.");
        System.out.println(sb2.length());     // length
        System.out.println(sb2.capacity());   // length+16
	System.out.println(sb.charAt(9));     // M
		
	}
}
