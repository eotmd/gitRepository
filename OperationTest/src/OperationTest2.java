import java.util.Scanner;

public class OperationTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x=9999;
		System.out.println("1,-1,0�߿� �ϳ��� �Է��� �ּ���.");
		String result ="";
		x= scan.nextInt();
		
		result = (x == 1) ? "���": (x == -1) ? "����":"0";
		
		System.out.println(result);
		
		
		

	}

}
