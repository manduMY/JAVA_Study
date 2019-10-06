import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade() {
		math = 0;
		science = 0;
		english = 0;
	}
	public Grade(int m, int s, int e) {
		math = m;
		science = s;
		english = e;
	}
	public int average() {
		return (math+science+english)/3;
	}
}

public class JS04_02_15012971 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}
}