package chap03;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		double average =0.0;//���
		int count=0;//���� ������ ����
		int sum=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ���");
		int n =scan.nextInt();
		while(n!=-1) {//��Ƽ��, ���ʰ� -1
			sum+=n;
			count++;
			n=scan.nextInt();
		}
		if(count>0) {System.out.println("������ ����:"+count);
		average =(double)sum/count;
		System.out.println("���:"+average+"��");
		}
		else
			System.out.println("������ ������ 0�̶�, ����� ���Ҽ� �����ϴ�");
//		if(count==0)System.out.println("�Էµ� ������ �����ϴ�");
//		else {
//			System.out.println("������ ������"+count+"���̸�");
//			System.out.println("�հ���"+(double)sum/count+"�Դϴ�");
//		}
		
	}

}
