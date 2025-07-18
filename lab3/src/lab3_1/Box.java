package lab3_1;

public class Box {
	
	public double width;
	public double height;
	public double depth;
	
	public double getVolume() {
		return width*height*depth;
	}
	public Box(double width, double height, double depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
   public void resizeBox(Box b, int fold) {
	   b.width *= fold;
	   b.height *= fold;
	   b.depth *= fold;
   }
//	public void setDimension(double width, double height, double depth) {
//		
//		this.width = width;
//		this.height = height;
//		this.depth = depth;
//	}
	
	
}
