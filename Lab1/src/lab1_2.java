import java.util.Scanner;

public class lab1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf("coordinates( %.0f, %.0f) = ",a,b);
		if(a>0&&b>0)
		System.out.print("Q1");
		else if (a<0&&b>0)
		System.out.print("Q2");
		else if (a<0&&b<0)
		System.out.print("Q3");
		else if (a>0&&b<0)
		System.out.print("Q4");
		else if (a==0&&b==0)
		System.out.print("origin");
		else if (a==0&&b!=0)
		System.out.print("y-intercept");
		else if (a!=0&&b==0)
		System.out.print("x-intercept");			
	}
}
