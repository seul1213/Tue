package chap03;

import java.util.Random;
import java.util.Scanner;

//up-down����
//����� :1~99�Է�
//��ǻ��:1~99���� ���� ����
//����ڰ� ��ǻ�� ���� ���߸� ���Ӽ���
//�����>��ǻ�� �ٿ����
//�����<��ǻ�� ������
//trial=7ȸ ->���� :�̰�� ���� ����Ƚ�� ��� �����ߴ�
//Seed(�������� �˰����� ���)
public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand=new Random();
		
		int count =0;
		 final int TRY_NUMBER = 7;
		 boolean state =true;
        System.out.println("���ӽ���");
        rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1+rand.nextInt(3);
		
		while(true) {
			 count++;
				if(count>TRY_NUMBER) {
					state= false;
					break;
		 }
				
				int user =scan.nextInt();
				if(user >com)          System.out.println("down");
			 	else if(user<com)      System.out.println("up");
			 	else   break;	

	}
		 System.out.println("==========================");
		 if(state)System.out.println("�̰��");
		 else System.out.println("�����ߴ�");
		 scan.close();
	}
	}
