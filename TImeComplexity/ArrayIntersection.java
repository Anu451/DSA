// Problem statement
// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in ascending order.

public class ArrayIntersection {


	 public static void main(String[] args) {
		int arr1[] = {2,8,5,1,3,9,0};
		int arr2[] = {3,6,1,0};
		
		for(int i=0; i<arr1.length-1; i++){
			for(int j=0; j<arr1.length-1-i; j++){
				if(arr1[j] > arr1[j+1]){
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr2.length-1; i++){
			for(int j=0; j<arr2.length-1-i; j++){
				if(arr2[j] > arr2[j+1]){
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}

		int i=0;
		int j=0;

		while (i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]){
				System.out.print( arr1[i] + " ");
				i++;
				j++;
			}else if (arr1[i]<arr2[j]){
				i++;
			}else{
				j++;
			}
			
		}
	 }
}