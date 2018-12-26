
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		if(num == 0) {
			System.out.println("처음 오셨네요.");
			System.out.println("쿠폰을 발행합니다.");
		}else if(num % 5 == 0) {
			System.out.println(num+"번째 입니다.");
			System.out.println("무료로 음료 하나 선택가능합니다.");
			System.out.println("단, 3000원 이하만 가능합니다.");
		}else if(num == 9) {
			System.out.println("쿠폰을 다 사용 하셨습니다.");
		}else {
			num++;
		}
		System.out.println("현재 쿠폰의 개수 : "+num);

	}

}
