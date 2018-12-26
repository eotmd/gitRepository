import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score=0;
		
		System.out.println("성적을 입력해 주세요.");
		
		score = scan.nextInt();
		
		if(score >= 60)	{
			System.out.println(+score+"점은 합격입니다.");
		}else{
			System.out.println(+score+"점은 불합격입니다.");
		}
		
		
		

	}

}
