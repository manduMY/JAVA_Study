package Ch05_02;

class TV {
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public int getColor() {
		return color;
	}
}
class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip,int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� " + ip + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
}
public class JS05_02_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" �ּҿ� 32��ġ, 2048�÷�
		iptv.printProperty();
	}
}
