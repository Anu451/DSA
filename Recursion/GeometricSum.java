package Recursion;

public class GeometricSum {
	public static double CalculateSum(int k){
		if (k == 0){
			return 1;
		}

		return 1/Math.pow(2, k) + CalculateSum(k-1);
	}


	public static void main(String[] args) {
		System.out.println(CalculateSum(1));
	}
}
