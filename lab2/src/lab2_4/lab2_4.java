package lab2_4;

import java.util.Scanner;

public class lab2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replace("happy", "happy :)");
		s = s.replace("sad", "sad :(");
		System.out.print(s);


	}

}
