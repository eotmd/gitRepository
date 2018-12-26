import java.util.Scanner;

public class OperationTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x=9999;
		System.out.println("1,-1,0중에 하나를 입력해 주세요.");
		String result ="";
		x= scan.nextInt();
		
		result = (x == 1) ? "양수": (x == -1) ? "음수":"0";
		
		System.out.println(result);
		
		
		

	}

}
