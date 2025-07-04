package lab2_2;

public class lab2_2 {

	public static void main(String[] args) {
		
//System.out.println(5);
		
		final int SIZE =5 ;
		
		int [][] grid = new int [SIZE][SIZE];
		for (int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				grid[i][j] = i * SIZE + j + 1;
			}
		}
		
		
		for (int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				System.out.print(grid[j][i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j<SIZE; j++) {
				
				if(i%2==0) {
					System.out.print(grid[i][j]);
					System.out.print(" ");
				}
				else{
					System.out.print(grid[i][4-j]);
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		}
	}


