package Ch05_04;

import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다.");
		scanner.close();
	}
}
class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}
public class JS05_04_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}