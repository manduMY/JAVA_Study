import java.util.Scanner;

public class JS02_10_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		int x = (x2-x1) * (x2-x1);
		int y = (y2-y1) * (y2-y1);
		
		if(r1+r2 <= Math.sqrt(x+y)) {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		else {
			System.out.println("�� ���� ���� ��ģ��.");
		}
	}
}