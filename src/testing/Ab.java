package testing;

import java.util.Scanner;

public class Ab {
	
	public static void main(String[] args) {
		
		System.out.print("What is your mark? :");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int m = Integer.parseInt(name);		
		System.out.println(m+5);
		
	}

}
