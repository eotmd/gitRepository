import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		for(int i = 1; i<=3; i++) {
			System.out.println("���ڸ� �Է��ϼ���");
			num = scan.nextInt();
			if(num%2 == 0) {
				System.out.println(num+"�� ¦�� �Դϴ�.");
			}else {
				System.out.println(num+"�� Ȧ�� �Դϴ�.");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
