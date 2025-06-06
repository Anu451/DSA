// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:

// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.

package Recursion;

public class CheckAB {

	public static boolean helper(String str, int idx){

		if(idx == str.length()){
			return true;
		}

		if(str.charAt(idx) !='a'){
			return false;
		}

		if(idx +2 < str.length() && str.charAt(idx +1) == 'b' && str.charAt(idx+2) == 'b'){
			return helper(str, idx+3);
		}

		return helper(str, idx +1);

	}
	public static boolean checkAB(String str){
		if(str.length() == 0){
			return false;
		}

		return helper(str, 0);
	}
	public static void main(String[] args) {
	
		String str = "abb";

		System.out.println(checkAB(str));

	
	}
}
