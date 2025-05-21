// Problem statement
// Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.

// Return -1 if x is not present in the given array. Note : If given array size is even, take first mid.

package Recursion;

public class BinarySearch {

	public static int binarySol(int arr[], int si, int ei, int x){
		if(si>ei){
			return -1;
		}

		int mid = (si+ei)/2;

		if(arr[mid] == x){
			return mid;
		}else if (arr[mid]<x){
			return binarySol(arr, mid+1, ei, x);
		}else{
			return binarySol(arr, si, mid-1, x);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};

	System.out.println(binarySol(arr, 0, arr.length-1, 9));
	}
}
