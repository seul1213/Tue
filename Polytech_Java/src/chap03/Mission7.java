package chap03;//�޷� �����

public class Mission7 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=31; i++) {
		count++;	
		System.out.printf("%5d",i);//printf������ �����ؼ� �����ֱ� ������ ����(-�� ��������)
		if(count%7 == 0) System.out.println();//������ �����ֱ� (���ڿ�����)
		}

	}

}
