import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
}
public class JS04_08_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("�ο���>>");
		int n = sc.nextInt();
		Phone ph[] = new Phone[n];
				
		for(int i=0;i<n;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String saveName = sc.next();
			String saveTel = sc.next();
			ph[i] = new Phone(saveName,saveTel);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			int flag=0;
			System.out.print("�˻��� �̸�>>");
			String search = sc.next();
			if(search.equals("�׸�"))	break;
			for(int i=0;i<n;i++) {
				if(ph[i].getName().equals(search)) {
					System.out.println(ph[i].getName() + "�� ��ȣ�� " + ph[i].getTel() + " �Դϴ�.");
					flag = 1;
				}
				
			}
			if(flag == 0)	System.out.println(search + "�� �����ϴ�.");
		}
	}

}
