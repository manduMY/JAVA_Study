package Ch05_06;

class Point {
	private int x,y;
	public Point(int x, int y) {this.x = x; this.y =y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}
class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + "����" + "("+ getX() + "," + getY() + ") ��";
	}
}
public class JS05_06_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorPoint zeroPoint = new ColorPoint(); // (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) ��ġ�� BLACK �� ��
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}
