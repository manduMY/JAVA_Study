import java.util.Scanner;

public class JS03_14_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int flag = 0;
			
			System.out.print("과목 이름>>");
			String cour = sc.next();
			if(cour.equals("그만"))	break;
			for(int i=0;i<5;i++) {
				if(cour.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					flag = 1;
					break;
				}
			}
			if(flag == 0)	System.out.println("없는 과목입니다.");	
		}	
	}
}