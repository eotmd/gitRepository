

public class Test2 {

	public static void main(String[] args) {
		/*switch
		표현식
		switch(조건식) {
		case 값1:
				조건식의 결과가 값1과 같을 경우 수행할 문장들 
				break;
		case 값2:
				조건식의 결과가 값2와 같을 경우 수행될 문장들
				break;
		default:
			조건식의 결과의 일치하는 case문이 없을때 수행될 문장들
			break;
		}
		*/

		int score=0;
		
		score = (int)(Math.random() * 10) + 1;
		
		switch(score * 100) {
		case 100:
				System.out.println("당신의 점수는 100이고, 상품은 자전거 입니다."); 
				break;
		case 200:
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다."); 
				break;
		case 300:
			System.out.println("당신의 점수는 300이고, 상품은 노트북 입니다."); 
				break;
		default:
			System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다."); 
			break;
		
		}

	}
}
