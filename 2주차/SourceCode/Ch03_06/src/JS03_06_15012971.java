import java.util.Scanner;

public class JS03_06_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] unit = {50000,10000,1000,500,100,50,10,1};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scan.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			if(money/unit[i] == 0)	continue;
			System.out.println(unit[i] + "�� ¥�� : " + money/unit[i] + "��");
			money %= unit[i];
		}
	}
}