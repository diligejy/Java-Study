package Calculator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("ù ��° ���� �Է��ϼ���");
		Scanner sc1 = new Scanner(System.in);
		int u1 = sc1.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���.");
		Scanner sc2 = new Scanner(System.in);
		int u2 = sc2.nextInt();
		System.out.println("�Է��Ͻ� ���� " + u1 +", "+ u2 + "�Դϴ�");
		System.out.println("������ �����" + (u1+u2) + "�Դϴ�");
		System.out.println("������ �����" + (u1-u2) + "�Դϴ�");
		System.out.println("������ �����" + (u1*u2) + "�Դϴ�");
		System.out.println("�������� �����" + ((double)u1/u2) + "�Դϴ�");
	}
	
}
