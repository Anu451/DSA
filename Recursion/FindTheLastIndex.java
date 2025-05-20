// Problem statement
// Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.

// Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.

// You should start traversing your array from 0, not from (N - 1).

// Do this recursively. Indexing in the array starts from 0.

package Recursion;

public class FindTheLastIndex {
	public static int findLast (int arr[], int si, int targert){
		if(si == arr.length){
			return -1;
		}

		int lastIndex = findLast(arr, si+1, targert);
		if (lastIndex != -1) {
			return lastIndex;
		}
		if(arr[si] == targert){
			return si;
		}

		return -1;
	}
	public static void main(String[] args) {
		int si =0;
		int arr[] ={1,2,4,3,4,3,5,6,3,5,6,6};
		int target = 3;
		System.out.println(findLast(arr, si, target));

	}
}
