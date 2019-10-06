
public class JS03_10_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[][] = new int[4][4];
		int cnt = 0;
		
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j] = 0 ;
			}
		}
		
		while(true) {
			int randomRow = (int)(Math.random() * 10 % 4);
			int randomColumn = (int)(Math.random() * 10 % 4);
			
			if(intArray[randomRow][randomColumn] == 0) {
				intArray[randomRow][randomColumn] = (int)(Math.random() * 10 + 1);
				cnt++;
			}
			if(cnt >= 10) break;
		}
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println();
		}
	}
}
