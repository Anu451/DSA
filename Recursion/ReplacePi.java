package Recursion;

public class ReplacePi {
	public static String replace(String str){
		if(str.length()<=1){
			return str;
		}

		if(str.charAt(0)=='p' && str.charAt(1) == 'i'){
			String smallOutput = replace(str.substring(2));
			return "3.14" + smallOutput;
 		}else{
			String smallOutput = replace(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		System.out.println(replace("adpispiksdpi"));
	}
}
