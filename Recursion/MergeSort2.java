// Problem statement
// You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.

// You must sort the elements between 'l' and 'r'.

package Recursion;

public class MergeSort2 {

	public static void merge(int arr[], int l, int r, int mid){
		int n1 = mid-l+1;
		int n2 = r-mid;

		int b[] = new int[n1];
		int c[] = new int[n2];

		for(int i=0;i<n1;i++){
			b[i] = arr[l+i];
		}
		for(int j=0; j<n2;j++){
			c[j] = arr[mid+1+j];
		}
		int i=0, j=0, k=l;
		while (i<n1 && j<n2) {
			if(b[i]<c[j]){
				arr[k++] = b[i++];
			}else{
				arr[k++] = c[j++];
			}

			
		}

		while(i<n1){
			arr[k++] = b[i++];
		}
		while(j<n2){
			arr[k++] = c[j++];
		}

	}
	public static void mergeSort(int arr[], int l, int r){
		if(l<r){
			int mid = (l+r)/2;

			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, r, mid);
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,4,3,5,2,6,9,8,7,10};
		int l=0;
		int r = arr.length-1;
		
		mergeSort(arr, l, r);
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}
