
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		if(num == 0) {
			System.out.println("ó�� ���̳׿�.");
			System.out.println("������ �����մϴ�.");
		}else if(num % 5 == 0) {
			System.out.println(num+"��° �Դϴ�.");
			System.out.println("����� ���� �ϳ� ���ð����մϴ�.");
			System.out.println("��, 3000�� ���ϸ� �����մϴ�.");
		}else if(num == 9) {
			System.out.println("������ �� ��� �ϼ̽��ϴ�.");
		}else {
			num++;
		}
		System.out.println("���� ������ ���� : "+num);

	}

}
