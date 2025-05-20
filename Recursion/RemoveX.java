// Problem statement
// Given a string, compute recursively a new string where all 'x' chars have been removed.



package Recursion;

public class RemoveX {

	public static String remove (String str){
		if(str.length() == 0){
			return str;
		}

		String smallOutput = remove(str.substring(1));

		if(str.charAt(0) == 'x'){
			return smallOutput;
		}else{
			return str.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		System.out.println(remove("dxcdxswexxsdexs"));
	}
}
