package chap03;

import java.util.Scanner;

public class Mission15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("�������� �Է��Ͻÿ�:");
			int dividend = sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ�:");
			int divisor = sc.nextInt();
			try {
				System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�");
				break;}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �������ϴ�! �ٽ� �Է��ϼ���");
			}
			}
		}
	}


