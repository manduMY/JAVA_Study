import java.util.Scanner;

public class JS02_06_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int num = sc.nextInt();
		int cnt = 0 ;
		if((num%10)%3 == 0) {
			cnt++;
		}
		if((num/10)%3 == 0) {
			cnt++;
		}
		System.out.print("¹Ú¼ö");
		if(cnt == 1) {
			System.out.println("Â¦");
		}
		else if(cnt == 2) {
			System.out.println("Â¦Â¦");
		}
	}

}
