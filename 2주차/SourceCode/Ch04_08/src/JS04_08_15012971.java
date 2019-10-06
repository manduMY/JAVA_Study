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
		System.out.print("인원수>>");
		int n = sc.nextInt();
		Phone ph[] = new Phone[n];
				
		for(int i=0;i<n;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String saveName = sc.next();
			String saveTel = sc.next();
			ph[i] = new Phone(saveName,saveTel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			int flag=0;
			System.out.print("검색할 이름>>");
			String search = sc.next();
			if(search.equals("그만"))	break;
			for(int i=0;i<n;i++) {
				if(ph[i].getName().equals(search)) {
					System.out.println(ph[i].getName() + "의 번호는 " + ph[i].getTel() + " 입니다.");
					flag = 1;
				}
				
			}
			if(flag == 0)	System.out.println(search + "이 없습니다.");
		}
	}

}
