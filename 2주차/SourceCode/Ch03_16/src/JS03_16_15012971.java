import java.util.Scanner;

public class JS03_16_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mookjjibba [] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int computer = (int)(Math.random()*3);
			
			System.out.print("���� ���� ��!>>");
			String user = sc.next();
			if(user.equals("�׸�"))	break;
			
			if(mookjjibba[computer].equals("����")) {
				if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", �����ϴ�.");
				}
				else if(user.equals("��")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �����ϴ�.");
				}
			}
			else if(mookjjibba[computer].equals("����")) {
				if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", �����ϴ�.");
				}
				else if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �����ϴ�.");
				}
				else if(user.equals("��")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �̰���ϴ�.");
				}
			}
			else if(mookjjibba[computer].equals("��")) {
				if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �����ϴ�.");
				}
				else if(user.equals("����")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(user.equals("��")) {
					System.out.println("����� = " + user + " , ��ǻ�� = " + mookjjibba[computer] + ", �����ϴ�.");
				}
			}
		}	
	}
}