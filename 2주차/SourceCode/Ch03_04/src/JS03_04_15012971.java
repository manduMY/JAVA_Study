import java.util.Scanner;

public class JS03_04_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char str = scan.next().charAt(0);
		int i = 0;
		while(true) {
			
			for(char j = 'a';j<=str;j++) {
				System.out.print(j);
			}
			System.out.println();
			str -= 1;
			if(str < 'a') break;
		}
	}
}