import java.util.Scanner;

public class JS02_08_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("�� (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int inner = 0;
		if((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) {
			inner++;
		}
		if((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)) {
			inner++;
		}
		if(inner == 0) {
			System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		} else {
			System.out.println("�� ���簢���� �浹�մϴ�.");
		}
	}
	

}
