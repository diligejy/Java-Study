package MultiplicationTable;

import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		System.out.println("2���� 9������ ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		if (times < 2) {
			System.out.println("�ʹ� ������ �Ƴ�?");
		} else if (times > 9) {
			System.out.println("9���� ������ �������");
		} else {
			System.out.println("�ϰ� �Է��� ���� " + times + "���Դϴ�");
			Test.calculate(times);
		}
	}
}
