import java.util.Scanner;

public class StudentScore {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ڽ��� ������ �Է��� �ּ���.");
		
		int score;
		
		score = scan.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else if(score >= 90 ) {
			System.out.println(score+ "���� A����");
		}else if(score >= 80){
			System.out.println(score+ "���� B����");
		}else if(score >= 70 ) {
			System.out.println(score+ "���� C����");
		}else {
			System.out.println(score+ "���� F����");
		}
		
		
		

	}

}
