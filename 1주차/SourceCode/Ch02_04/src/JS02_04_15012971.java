import java.util.Scanner;

public class JS02_04_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int temp;
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println("중간 값은 " + num2);
	}

}
