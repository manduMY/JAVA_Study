import java.util.Scanner;

public class JS03_08_15012971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		
		if(n < 10) {
			int intArray[] = new int[n];
			for(int i=0;i<n;i++) {
				int rand = (int)(Math.random()*100)+1;
				intArray[i] = rand;
				System.out.print(intArray[i] + " ");
			}
			
		} else {
			int ini = n/10 + 1;
			int inj = n%10;
			
			int intArray[][] = new int[ini][];
			for(int i=0;i<ini;i++) {
				if(i == ini-1) {
					intArray[i] = new int[inj];
					break;
				}
				intArray[i] = new int[10];
				
			}
			for(int i=0;i<intArray.length;i++) {
				for(int j=0;j<intArray[i].length;j++) {
					int rand = (int)(Math.random()*100)+1;
					intArray[i][j] = rand;
				}
			}
			for(int i=0;i<intArray.length;i++) {
				for(int j=0;j<intArray[i].length;j++) {
					int rand = (int)(Math.random()*100)+1;
					System.out.print(intArray[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
