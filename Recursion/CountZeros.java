package Recursion;

public class CountZeros {
public static int countZeroHelper(int num){
	if( num == 0) {
		return 0;
	}

	int deg = num % 10;

	if(deg == 0){
		return 1 + countZeroHelper(num / 10);
	}else{
		return  countZeroHelper(num / 10);
	}
}

	public static int countZero(int num) {
		if(num == 0){
			return 1;
		}
		return countZeroHelper( num);
	}


	public static void main(String[] args) {

		int num = 65609060;
		System.out.println(countZero(num));
		
		
	}
}
