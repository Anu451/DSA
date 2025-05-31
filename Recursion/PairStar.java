// Problem statement
// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

package Recursion;


public class PairStar {
	public static String pairStats(String str){
		if(str.length() <= 1){
			return str;
		}

		if(str.charAt(0) == str.charAt(1)){
			return str.charAt(0)+ "*" + pairStats(str.substring(1));
		}else{
			return str.charAt(0) + pairStats(str.substring(1));
		}
	}
	public static void main(String[] args) {
		String str = "aabbcccddfdd";
System.out.println(		pairStats(str));
	}
}
