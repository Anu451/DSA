public class ArrayEqullibrium {
	public static int Equillibrium(int arr[]){

		int totalSum = 0;
		int leftSum  = 0;

		for(int i=0; i<arr.length; i++){
			totalSum += arr[i];
		}

		for(int i=0; i<arr.length; i++){	
			int rightSum = totalSum - leftSum - arr[i];
			if(leftSum == rightSum){
				return i;
			}
			leftSum += arr[i];
		}

		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,2,2,5,4,1,8};
		System.out.println(Equillibrium(arr));
	}
}
