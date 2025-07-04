package lab2_3;

import java.util.Scanner;
public class lab2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter started day"+" :");
		int n = sc.nextInt();
		System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa\t");
		
		final int SIZE =7 ;
		
		int [][] grid = new int [SIZE][SIZE];
		for (int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				grid[i][j] = i * SIZE + j + 1;
			}
		}
		
		for (int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				
					System.out.print(grid[i][j]);
					System.out.print("\t");
				
			}
			System.out.println();
		}
	}

}
