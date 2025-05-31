package Recursion;

public class TowerOfHanoi {
	public static void tower(int disks, char source, char auxiliary, char destination) {
		// Write your code here
		if(disks > 0){
			tower(disks-1, source, destination, auxiliary);
			System.out.println(source + " " + destination);
			tower(disks-1, auxiliary, source, destination);
		}
	}
public static void main(String[] args) {
	tower(2, 'A', 'B', 'C');

}
}
