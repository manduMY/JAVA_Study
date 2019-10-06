import java.util.Scanner;

public class JS03_16_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mookjjibba [] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int computer = (int)(Math.random()*3);
			
			System.out.print("가위 바위 보!>>");
			String user = sc.next();
			if(user.equals("그만"))	break;
			
			if(mookjjibba[computer].equals("가위")) {
				if(user.equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 이겼습니다.");
				}
				else if(user.equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 비겼습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 졌습니다.");
				}
			}
			else if(mookjjibba[computer].equals("바위")) {
				if(user.equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 비겼습니다.");
				}
				else if(user.equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 졌습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 이겼습니다.");
				}
			}
			else if(mookjjibba[computer].equals("보")) {
				if(user.equals("바위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 졌습니다.");
				}
				else if(user.equals("가위")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 사용자가 이겼습니다.");
				}
				else if(user.equals("보")) {
					System.out.println("사용자 = " + user + " , 컴퓨터 = " + mookjjibba[computer] + ", 비겼습니다.");
				}
			}
		}	
	}
}