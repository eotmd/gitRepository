import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul=0;
		int num=0;
		System.out.println("������");
		System.out.println("����� ���Ͻʴϱ�?\n(���ڸ� �Է����ּ���.)");
		
		num = scan.nextInt(); 
		
		
		
			
		
		if(num == 0) {
			System.out.println("������");
			for(int a = 2; a < 10; a++) {
				for(int b = 1; b < 10; b++) {
					mul=a*b;
					System.out.println(a+" * "+b+" = "+mul);
				}
			}
			
		}else{
			System.out.println(num+"��");
			for(int i = 1; i < 10; i++) {
				
				mul= num*i;
				System.out.println(num+" * "+i+" = "+mul);
			}
		
		}
	}
}
