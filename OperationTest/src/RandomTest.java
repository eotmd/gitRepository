

public class RandomTest {

	public static void main(String[] args) {
		

		int score=0;
		
		score = (int)(Math.random() * 10);
		
		
		System.out.println(score);

	}
}
/*
0.999999999999999999 ~ 0.0
0.99 x 10 =9.9 ~ 0.0 x 10 = 0
9.9 + 1 = 10.9 ~ 0.0 + 1 = 1.0
(int형)10.9 = 10
만약 double형 이라면 소수점까지 가능
*/