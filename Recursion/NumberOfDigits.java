package Recursion;

// You are given a number 'n'.
// Return number of digits in ‘n’.

// Example:
// Input: 'n' = 123

// Output: 3

public class NumberOfDigits {

	public static int count(int num){
		if(num/10 ==0){
			return 1;
		}
		return 1 + count(num/10);
	}
	public static void main(String[] args) {
		System.out.println(count(12345));
	}
	
}