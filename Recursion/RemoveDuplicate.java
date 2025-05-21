// Problem statement
// Given a string S, remove consecutive duplicates from it recursively.

package Recursion;

public class RemoveDuplicate {
	
	public static String remove(String str){
		if(str.length()<=1){
			return str;
		}

		if(str.charAt(0) == str.charAt(1)){
			String smallOutput = remove(str.substring(1));
			return smallOutput;
		}else{
			String smallOutput = remove(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		System.out.println(remove("asddcddsswwekkkkk"));
	}
}
