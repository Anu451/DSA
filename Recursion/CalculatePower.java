package Recursion;

// Problem statement 
// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.


public class CalculatePower {
	public static int power(int x, int n){
		if(n == 0){
			return 1;
		}
		return x * power(x, n-1);
	}
	public static void main(String[] args) {
		System.out.println(power(10, 2));
	}
}
