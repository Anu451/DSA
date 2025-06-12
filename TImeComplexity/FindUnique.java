// Problem statement

// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

// You need to find and return that number which is unique in the array/list.

//  Note:
// Unique element is always present in the array/list according to the given condition.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the unique element present in the array.

// Output for every test case will be printed in a separate line

import java.util.Arrays;

public class FindUnique {

	// travesring through the loop 
	// time complexity => O(N log N) (sorting array) + traversing through the loop once N
	// = > n Log n + n => O(N log N)

	public static int sol1(int arr[]){
		Arrays.sort(arr);
		int i=0;

		while(i<arr.length - 1){
			if(arr[i] != arr[i+1]){
				return i;
			}
			i+=2;
		}

		return arr[arr.length-1];
	}


	public static int sol2(int arr[]){
		int result =0;

		for(int num : arr){
			result ^= num;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,5,2,1,5,7,9,6,7,6};

		System.out.println( sol2(arr));

	}
}
