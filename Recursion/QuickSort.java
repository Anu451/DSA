package Recursion;

public class QuickSort {

	public static int partition(int[] arr, int si, int ei){
		int piviotEle = arr[si];
		int count = 0;
		for(int i=si+1; i<=ei; i++){
			if(arr[i] < piviotEle){
				count++;
			}
		}

		int pivotIndex = si + count;
	int temp = arr[pivotIndex];
	arr[pivotIndex] = arr[si];
	arr[si] = temp;

		int i = si;
		int j = ei;

		while (i<j){
			if(arr[i] < piviotEle){
				i++;
			}else if (arr[j] >= piviotEle){
				j--;
			}else{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return si+count;
	}
	public static void quickSort( int[] arr, int si, int ei){
		if(si >= ei){
			return;
		}

		int piviotPoint = partition(arr, si, ei);
		quickSort(arr, si, piviotPoint-1);
		quickSort(arr, piviotPoint+1, ei);
	}
	public static void main(String[] args) {
		int arr[] ={3,2,5,7,6,1,6,2,9,11,10};
		quickSort(arr, 0, arr.length-1);

		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}
