// Problem statement
// Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

// Do this recursively.




package Recursion;

public class ReplaceChar {
	public static String replace(String str, char a, char b){
		if(str.length()==0){
			return str;
		}
		String smallOutput = replace(str.substring(1),a,b);

		if(str.charAt(0) == a){
			return b + smallOutput;
		}else{
			return str.charAt(0)+ smallOutput;
		}
	}
	public static void main(String[] args) {

		System.out.println(replace("abcadeadrahc", 'a', 'z'));
	}
}
