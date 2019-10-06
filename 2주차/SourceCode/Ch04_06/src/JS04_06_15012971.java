import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public boolean calculate(Circle c) {
		if((radius*radius) < (c.radius*c.radius))
			return true;
		
		return false;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
	}
}
public class JS04_06_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double rx = scanner.nextDouble();
			double ry = scanner.nextDouble();
			int rRadius = scanner.nextInt();
			c[i] = new Circle(rx,ry,rRadius);
		}
		int max = 0;
		for(int i=0;i<c.length;i++) {
			if(c[max].calculate(c[i])) max=i;
			
		}
		c[max].show();
	}
}