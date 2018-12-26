import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		for(int i = 1; i<=3; i++) {
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			if(num%2 == 0) {
				System.out.println(num+"은 짝수 입니다.");
			}else {
				System.out.println(num+"은 홀수 입니다.");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
