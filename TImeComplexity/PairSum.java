// Problem statement
// You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.

// Note:
// Given array/list can contain duplicate elements. 

import java.util.Arrays;

public class PairSum {
	public static int totalPair(int arr[]){

		Arrays.sort(arr);
		int sum = 8;

		int l=0;
		int r = arr.length-1;
		int totalPair = 0;

		while (l<r) {
			int num = arr[l] + arr[r];

			if(num < sum){
				l++;
			}else if(num > sum){
				r--;
			}else{
				if(arr[l] == arr[r]){
					int count = r-l+1;
					totalPair += (count * (count-1))/2;
					break;
				}
				int countL =1;
				int countR =1;

				while (l+1 < r && arr[l] == arr[l+1]) {
					countL++;
					l++;
				}
				while (r-1 > l && arr[r] == arr[r-1]) {
					countR++;
					r--;
				}

				totalPair += countL * countR;
				l++;
				r--;
			}

		}
		return totalPair;

	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,3,2,1,4,7,8};

		System.out.println(totalPair(arr));
		
	}
}
