// Problem statement
// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

package Recursion;

public class StingToInt {

	public static int convertToNum(String str, int index){
		if(index == str.length()){
			return 0;
		}

		int num = str.charAt(index) - '0';
		return num * (int)Math.pow( 10, str.length() - index - 1) + convertToNum(str, index+1);
	}
	public static void main(String[] args) {
		String str = "12345";
		int index = 0;

		System.out.println(convertToNum(str, index));

	}
}
