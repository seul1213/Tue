package chap03;

public class Mission4 {
//1~100������ �� �߿���
//3�� ����� �ջ��� ���(sum)�� ����϶�
//13�� ��� ���������� �ջ��϶�	
	public static void main(String[] args) {
	//1.1~100������ ���� �߿� 13�� ����� �ջ��϶�
			int sum=0;
			for(int num=1; num<=10; num++) 
				if(num%13==0) sum+=num;
					
	//1.1~100������ ���� �߿� 13�� �Ǹ�� �������� �ջ��϶�
			sum=0;
			for(int num=1; num<=10; num++) {
				if(num%13==0) break;
				sum+=num;		
		}		
	//3.1~100������ ���� ���� 13�� ������ ���ڸ� �ջ��϶�
			sum=0;
			for(int num=1; num<=10; num++) {
				if(num%13==0) continue;
			sum+=num;	
			}
			
			System.out.println("sum="+sum);
		
}
}