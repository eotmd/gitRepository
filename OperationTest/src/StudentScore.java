import java.util.Scanner;

public class StudentScore {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자신의 점수를 입력해 주세요.");
		
		int score;
		
		score = scan.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
		}else if(score >= 90 ) {
			System.out.println(score+ "점은 A학점");
		}else if(score >= 80){
			System.out.println(score+ "점은 B학점");
		}else if(score >= 70 ) {
			System.out.println(score+ "점은 C학점");
		}else {
			System.out.println(score+ "점은 F학점");
		}
		
		
		

	}

}
