package lab3_1;

public class Program3 {
	
	public static void main(String[] args) {
		Box box1 = new Box(3,4,5);
		
		box1.resizeBox(box1, 2);
		box1.getVolume();
	//	box1.setDimension(3, 4, 5);
		
		System.out.println(box1.getVolume());
		
		
		
	}
}
