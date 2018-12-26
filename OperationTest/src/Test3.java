import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul=0;
		int num=0;
		System.out.println("구구단");
		System.out.println("몇단을 원하십니까?\n(숫자를 입력해주세요.)");
		
		num = scan.nextInt(); 
		
		
		
			
		
		if(num == 0) {
			System.out.println("구구단");
			for(int a = 2; a < 10; a++) {
				for(int b = 1; b < 10; b++) {
					mul=a*b;
					System.out.println(a+" * "+b+" = "+mul);
				}
			}
			
		}else{
			System.out.println(num+"단");
			for(int i = 1; i < 10; i++) {
				
				mul= num*i;
				System.out.println(num+" * "+i+" = "+mul);
			}
		
		}
	}
}
