package chap02;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Ű �Է��ϼ���>>");
		int height =scan.nextInt();
		System.out.print("���� �Է��ϼ���>>");
		int age =scan.nextInt();
		
		//���ǽ����� ���(�������� Ȱ��)
		if(height>=140 && age>=10) System.out.println("Ÿ�� ���ƿ�!");
		else                       System.out.println("��Ÿ��!");                 
	
		

	}

}
