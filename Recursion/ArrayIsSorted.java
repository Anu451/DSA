// Problem statement
// You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.



package Recursion;

public class ArrayIsSorted {
	public static boolean IsSoretd(int arr[], int n, int si){
		if(n == 0){
			return false;
		}else if(si == n-1){
			return true;
		}

		if(arr[si]>arr[si+1]){
			return false;
		}

		return IsSoretd(arr,n,si+1);
	}
	public static void main(String[] args) {
		int si =0;
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		System.out.println(IsSoretd(arr, n,si));
	}
}
