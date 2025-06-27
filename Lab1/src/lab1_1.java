import java.util.Scanner;

public class lab1_1 {

	public static void main(String[] args) {
		
		System.out.print("Enter triangle side:");
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		System.out.print("Enter triangle length:");
		double l = sc.nextDouble();
		double a;
		a = ((Math.sqrt(3)/4)*2)*(s*s)+((s*l)*3);
		System.out.printf("%.2f",a);
	}
}
