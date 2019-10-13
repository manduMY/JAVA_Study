package Ch05_10;
abstract class PairMap {
	   protected String KeyArray[]; // key ���� �����ϴ� �迭
	   protected String valueArray[]; // value ���� �����ϴ� �迭
	   abstract String get(String key); // key ���� ���� value ����, ������ null ����
	   abstract void put(String key, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	   abstract String delete(String key); // key ���� ���� ������ (value�� �Բ�) ����, ������ value �� ����
	   abstract int length(); // ���� ����� �������� ���� ����
	}
class Dictionary extends PairMap{
	private int arrayLength;
	
	public Dictionary(int length) {
		KeyArray = new String[length];
	    valueArray = new String[length];
		this.arrayLength = 0;
	}
	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for(int i=0;i<KeyArray.length;i++) {
			if(key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	@Override
	public void put(String key, String value) {
		// TODO Auto-generated method stub
		for(int i=0;i<KeyArray.length;i++) {
			if(key.equals(KeyArray[i])) {
				KeyArray[i] = key;
	            valueArray[i] = value;
				return;
			}
		}
		KeyArray[arrayLength] = key;
		valueArray[arrayLength] = value;
		arrayLength++;
	}
	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		for(int i=0;i<KeyArray.length;i++) {
			if(KeyArray[i].equals(key)) {
				KeyArray[i] = null;
				valueArray[i] = null;
				return "";
			}
		}
		return null;
	}
	@Override
	int length() {
		// TODO Auto-generated method stub
		return arrayLength;
	}
	
	
}
public class JS05_10_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����")); //������ ������ ����
	}

}
