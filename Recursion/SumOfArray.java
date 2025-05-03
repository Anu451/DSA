package Recursion;

public class SumOfArray {
	public static int sum(int arr[], int idx){
		if(idx == arr.length){
			return 0;
		}
		return arr[idx] + sum(arr, idx+1); 
	}
	public static void main(String[] args) {
		int arr[] ={10,20,30,40,50,60,70,80,90,10};
		int idx =0; 
		System.out.println(sum(arr, idx));
	}
}