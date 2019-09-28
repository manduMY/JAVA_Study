import java.util.Scanner;

public class JS02_08_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
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
			System.out.println("두 직사각형은 충돌하지 않습니다.");
		} else {
			System.out.println("두 직사각형은 충돌합니다.");
		}
	}
	

}
