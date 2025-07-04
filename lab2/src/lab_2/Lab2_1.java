package lab_2;

import java.util.Scanner;
public class Lab2_1 {

	
	public static void main(String[] args) {
		
		System.out.print("Please input the number");
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		String s = sc.nextLine();
		int b = Integer.parseInt(s);
		int sum = 0;
		int v;
		System.out.print(b+" = ");
		while(b>0) {
		    v = b%10;
			b = b/10;
			
			sum = sum + v;
	//	System.out.println(v);
		
		}
		for(int i = 0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			if(i+1!=s.length()) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = "+sum);
		//System.out.println(s +"="+ v +sum);
	}

}
