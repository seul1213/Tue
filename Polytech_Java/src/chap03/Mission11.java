package chap03;

public class Mission11 {

	public static void main(String[] args) {
		int lotto_num[]=new int [7];
		String names[]= {"�ڽ���","���º�","������"};
		//�迭�� �� �Է�
		for(int i=0; i<7; i++) {
			lotto_num[i] =1 + (int)(Math.random()*45);
			for(int j=0; j<i; j++)
				if(lotto_num[i]==lotto_num[j])i--;
		}
		
		//�迭�� �� ���
//		for(int i=0; i<7; i++)
//			System.out.printf("%5d",lotto_num[i]);
		
		//foreach���� �̿��� �� ���
		for(int num: lotto_num)
			System.out.printf("%5d",num);
		
		System.out.println();
		for(String name:names )
			System.out.print(name+"");
	}

}
