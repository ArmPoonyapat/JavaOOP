package lab3_1;
import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		
		Book book1= new Book();
		//System.out.println(book1);
				book1.name="Harry Potter and The Chamber of Secret";
				//System.out.println(book1.name);
				book1.auther="J.K.Roeling";
				book1.year=2542;
				//System.out.println("Book : "+book1.name+" Written by "+book1.auther+" in "+book1.year);
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Book name: ");
				book1.name = sc.nextLine();
				System.out.print("Enter Book price: ");
				book1.price = sc.nextInt();
				
				//System.out.println("\nBook : "+book1.name+" \nWritten by "+book1.year+" Price is "+book1.price+" Bath");
				System.out.println("\nBook : "+book1.name+" \nWritten by "+book1.auther+" Rowling in "+book1.year+"\nPrice is "+book1.price+" Bath");
				
				Book book2 = new Book();
				System.out.println(book2);
	}

}
