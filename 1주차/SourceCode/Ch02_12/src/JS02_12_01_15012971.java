import java.util.Scanner;

public class JS02_12_01_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����>>");
		float num1 = sc.nextFloat();
		String s = sc.next();
		float num2 = sc.nextFloat();
		
		float result = 0;
		
		if(s.equals("+")) {
			result = num1 + num2;
		} else if(s.equals("-")) {
			result = num1 - num2;
		} else if(s.equals("/")) {
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			result = num1 / num2;
		} else if(s.equals("*")) {
			result = num1 * num2;
		}
		System.out.println(num1+s+num2+"�� ��� ����� "+result);
	}

}
