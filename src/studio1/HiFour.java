package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the name of first member: ");
		String s0 = in.nextLine();
		System.out.print("Please enter the name of second member: ");
		String s1 = in.nextLine();
		System.out.print("Please enter the name of third member: ");
		String s2 = in.nextLine();
		System.out.print("Please enter the name of fourth member: ");
		String s3 = in.nextLine();
		System.out.print("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3);
		//
		// Say hello to the names in s0 through s3.
		//
		//Please enter the name of first member: Sun
		//Please enter the name of second member: Patino
		//Please enter the name of third member: Nguyen
		//Please enter the name of fourth member: Quanze
		//Greetings Sun, Patino, Nguyen, and Quanze

	}
}
