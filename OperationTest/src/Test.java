import java.util.Scanner;

public class Test {

		
		public static void main(String[] args) {
			String grade="";
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("�ڽ��� ������ �Է��� �ּ���.");
			
			int score;
			
			score = scan.nextInt();
			if(score > 100 || score < 0) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}else if(score >= 90 ) {
				grade = "A";
				if(score >= 98) {
					grade = "A+";
				}else if(score < 94 ) {
					grade = "A-";
				}
				
				
			}else if(score >= 80){
				grade = "B";
				if(score >= 88) {
					grade = "B+";
				}else if(score < 84) {
					grade = "B-";
				}
				System.out.println(score+ "���� B����");
			}else if(score >= 70 ) {
				grade = "C";
				if(score >= 78) {
					grade = "C+";
				}else if(score < 74) {
					grade = "C-";
				}
				
			}else {
				grade = "F";
			}
			System.out.println(grade+"�����Դϴ�.");

	}

}
