public class Rectangle {
	private int length;
	private int width;
	
//	------------------------
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
//	------------------------
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
//	------------------------
	
	public void draw(int length, int width) {
		
		for(int i=0 ; i<length ; i++)
			System.out.print(" _ ");
		System.out.println();

		for(int i=0 ; i<width ; i++) {
			for (int j=0 ; j<1 ; j++) {
				System.out.print("|" + " ".repeat(this.length*3-2) + "|");
			}
			System.out.println();
		}
		
		for(int i=0 ; i<length ; i++)
			System.out.print(" _ ");
		System.out.println();

	}
	
	
	public int calcArea(int length, int width) {
		return length * width;
	}
	
	
	public int calcPerimeter(int length, int width) {
		return length*2 + width*2; 
	}
	
	
	public void scale(int factor) {
		this.length = length * factor;
		this.width = width * factor;
		System.out.println("length: " + this.length + ", width: " + this.width);
	}
	
	
	public String toString() {
		return "length: " + this.length + ", width: " + this.width;
	}
}