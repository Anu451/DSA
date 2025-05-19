
// Problem statement
// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.

// First index means, the index of first occurrence of x in the input array.

// Do this recursively. Indexing in the array starts from 0.


package Recursion;

public class FIndTheIndex {

	public static int FindIdx(int arr[], int idx, int targer){
		if(arr.length == 0 || idx == arr.length){
			return -1;
		}else if(arr[idx] == targer){
			return idx;
		}

		return FindIdx(arr, idx+1, targer);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int idx = 0;
		int targer = 5;
		System.out.println(FindIdx(arr, idx, targer));

	}
	
}
