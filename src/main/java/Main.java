import java.util.*;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter length then width: ");
		int l= input.nextInt();
		int w = input.nextInt();
		Rectangle rec = new Rectangle(l, w);
		
		System.out.print("Enter length then width: ");
		int length = input.nextInt();
		int width = input.nextInt();
		Rectangle rec2 = new Rectangle(length, width);
		
		rec.draw(rec.getLength(), rec.getWidth());
		rec2.draw(rec2.getLength(), rec2.getWidth());
		
		rec.scale(2);
		
		int p1 =rec.calcPerimeter(rec.getLength(), rec.getWidth());
		int p2 =rec2.calcPerimeter(rec2.getLength(), rec2.getWidth());

		System.out.println("The perimeter sum is: " + (p1 + p2));
		
		System.out.println(rec);
		System.out.println(rec2);

		
		System.out.print("Enter radius: ");
		double r= input.nextDouble();
		Circle c2 = new Circle(r);
		System.out.print(calcArea(r));
	}
}
