package chap02;
//switch �� Ȱ��
//����ڷκ��� month �� ������ �Է¹޾Ƽ�
//month�� days�� ������ּ���
//month :2-28,46911-30��, ��Ÿ
import java.util.Scanner;
public class Mission9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("��(1~12)>>");
		int month =scan.nextInt();
		int days =0;
		
		switch(month) {
		case 2:
			days =28;
			break;
		case 4:case 6:case 9:case 11:
			days =30;
			default:
			days =31;
			break;	
		}
		System.out.println(month+"����"+days+"�Դϴ�");
	}
	

}
