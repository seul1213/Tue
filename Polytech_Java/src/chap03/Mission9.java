package chap03;

import java.util.Scanner;

public class Mission9 {

	public static void main(String[] args) {
		double average =0.0;//���
		int count=0;//���� ������ ����
		int sum=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� (����):");
		int n =0;
		
		do {
			sum +=n;
			count++;
			n=scan.nextInt();
		}while(n!=-1); {//��Ƽ��, ���ʰ� -1
		count= count-1;
		if(count>0) {System.out.println("����:"+count+"��");
		average =(double)sum/count;
		System.out.printf("���:%.2f",average);
		}
		else
			System.out.println("������ ������ 0�̶�, ����� ���Ҽ� �����ϴ�");

	}
	}
}
