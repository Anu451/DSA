// Problem statement
// Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.


package Recursion;

public class NaturalNumbers {

	public static void NaturalNum(int num){
		if(num == 0){
			return;
		}

		NaturalNum(num-1);
		System.out.println(num);
	}

	public static void main(String[] args) {
		NaturalNum(10);
	}
}
