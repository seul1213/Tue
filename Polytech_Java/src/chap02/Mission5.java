package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է��ϼ���>>");
		 int money = scan.nextInt();
		 int �������� =money/50000;
		 int res =(money%50000);
		 int ������ =res/10000;
		 res =(money%10000);
		 int õ���� =money/1000;
		 res =(money%1000);
		 int ����� =money/100;
		 res =(money%100);
		 int ���ʿ��� =money/50;
		 res=(money%50);
		 int �ʿ��� =money/10;
		 res=(money%10);
		 int �Ͽ��� =money/50000;
		 res =(money%1000);
		 System.out.println("��������:" +�������� );
		 System.out.println("������ :" +������ );
		 System.out.println("õ���� :" +õ���� );
		 System.out.println("����� :" +����� );
		 System.out.println("���ʿ���:" +�ʿ��� );
		 System.out.println("�Ͽ��� :" +�Ͽ��� );

	}

}
