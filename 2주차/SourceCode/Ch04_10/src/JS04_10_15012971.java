import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String Kor2Eng(String word) {
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				if(i%2 == 0) {
					System.out.print(kor[i] + "�� ");
				} else {
					System.out.print(kor[i] + "�� ");
				}
				return eng[i];
			}
		}
		
		return word;
	}
}
public class JS04_10_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			String search = sc.next();
			if(search.equals("�׸�")) {
				break;
			}
			String word = Dictionary.Kor2Eng(search);
			
			if(word.equals(search)) {
				System.out.println(search + "�� ���� ������ �����ϴ�.");
			}
			else {
				System.out.println(word);
			}
				
			
			
		}
	}

}
