// Problem statement
// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.

// Do this recursively.

package Recursion;
public class CheckNumRecursively {
	public static boolean check(int arr[], int n, int targer){
		if(n==0){
			return false;
		}else if(arr[n-1] == targer){
			return true;
		}

		return check(arr, n-1, targer);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		System.out.println(check(arr, n, 99));
	}
	
}
