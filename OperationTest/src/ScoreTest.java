import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score=0;
		
		System.out.println("������ �Է��� �ּ���.");
		
		score = scan.nextInt();
		
		if(score >= 60)	{
			System.out.println(+score+"���� �հ��Դϴ�.");
		}else{
			System.out.println(+score+"���� ���հ��Դϴ�.");
		}
		
		
		

	}

}
