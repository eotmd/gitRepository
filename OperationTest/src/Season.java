import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("1~12�� �� ���ڸ� �Է��ϼ���");
		int m = 0;
		m = scan.nextInt();

		switch (m) {
		case 12:
		case 1:
		case 2:
			System.out.println(m + "���� �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(m + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(m + "���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(m + "���� �����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;

		}

	}
}

