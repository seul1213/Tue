package chap03;

import java.util.Random;
import java.util.Scanner;
public class UpDown {
	
public static void main(String[] args) {

		
		while(true) {
			Random rand = new Random();
			int card = rand.nextInt(100);//0~99���� ������ ���� �ޱ�
			Scanner scan = new Scanner(System.in);
			int num =0;
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
		
		while(num!=card) {//�Էµ� ���ڿ� ������ ���ڰ� ��ġ�Ҷ� ���� �ݺ�
			  num =scan.nextInt();
			if(num> card)
				System.out.println("down");
			else if(num<card)
				System.out.println("up");
			else//��ġ�� �ݺ����� ��������
			break;
}
			if(card == num) {
				System.out.println("����");
				System.out.println("�ٽ� �ϰڽ��ϱ�?(y/n)");
				String answer = scan.next();
			if(answer.equals("n")) {
				System.out.println("����");
				break;
			}
			else if(answer.equals("y"))
				continue;
			}scan.close();
		}
	
	}

}
