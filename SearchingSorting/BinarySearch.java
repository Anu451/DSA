// You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'. Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.



// Note:
// You must write an algorithm whose time complexity is O(LogN)

package SearchingSorting;

public class BinarySearch {
	public static int binary(int arr[], int targert){
		int l=0;
		int r= arr.length-1;
		while (l<=r) {
			int mid = (l+r)/2;

			if(arr[mid] == targert){
				return mid;
			}else if(arr[mid]<targert){
				l = mid+1;
			}else{
				r = mid-1;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binary(arr, 2));
	}
}
