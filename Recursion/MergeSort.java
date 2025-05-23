
// Problem statement
// You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.



// You must sort the elements between 'l' and 'r'.

package Recursion;


public class MergeSort {

	public static void merge(int b[], int c[], int arr[]){
		int i=0,j=0,k=0;

		while (i<b.length && j<c.length) {
			if(b[i]<c[j]){
				arr[k++] = b[i++];
			}else{
				arr[k++] = c[j++];
			}
		}

		while(i<b.length){
			arr[k++] = b[i++];
		}
		while(j<c.length){
			arr[k++] = c[j++];
		}
	}
	public static void mergeSort(int arr[]){
		if(arr.length<=1){
			return;
		}

		int b[] = new int[arr.length/2];
		int c[] = new int[arr.length - b.length];

		for(int i=0;i<arr.length/2;i++){
			b[i] = arr[i];
		}
		for(int j=arr.length/2; j<arr.length;j++){
			c[j-arr.length/2] = arr[j];
		}

		mergeSort(b);
		mergeSort(c);
		merge(b,c,arr);
		}
	
	public static void main(String[] args) {
		int arr[ ] = {1,4,3,5,2,8,9,6,10};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
