package chap02;
import java.util.Random;
// user �� com
//user�� 1,2,3 -���� ���� ��
//com�� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
//1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
//if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�
import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		
//		1)Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
//		int com =(int)(1+Math.random()*3);
		
		//2) Random() Ŭ������ nexInt, nextDouble..
		Random rand = new Random();
		 int com = 1+rand.nextInt(3);
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.print("����(1),����(2), ��(3) >>");
	 	 int user =scan.nextInt();
	 	 if(com==1)      System.out.println("��ǻ��:����");
	 	 else if(com==2) System.out.println("��ǻ��:����");
	 	 else            System.out.println("��ǻ��:��");
//	 	 System.out.println("��ǻ��"+com);
	 	 
//	 	 if(com==user) {
//	 		 System.out.println("�����ϴ�");}
//	 	 else if(com==1) {
//	 		 if(user==2)
//	 		 System.out.println("�̰���ϴ�");
//	 		 if(user==3)
//	 			 System.out.println("�����ϴ�");}
//	 	else if(com==2) {
//	 		 if(user==1)
//	 		 System.out.println("�����ϴ�");
//	 		 if(user==3)
//	 			 System.out.println("�̰���ϴ�");}
//	 	else if(com==3) {
//	 		 if(user==1)
//	 		 System.out.println("�̰���ϴ�");
//	 		 if(user==2)
//	 			 System.out.println("�����ϴ�");}
	 	 
	 	 int result =user-com;
	 	 if(result==0)                    System.out.println("���º�");
	 	 else if(result==-1 || result==2 )System.out.println("��ǻ�� ��!");
	 	 else                             System.out.println("����� ��!");
	 	 }
	 		
	 	 
	 		 }


