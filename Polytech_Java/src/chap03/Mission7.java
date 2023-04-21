package chap03;//달력 만들기

public class Mission7 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=31; i++) {
		count++;	
		System.out.printf("%5d",i);//printf형식을 지정해서 내려주기 오른쪽 정렬(-는 외쪽정렬)
		if(count%7 == 0) System.out.println();//밑으로 내려주기 (문자열연결)
		}

	}

}
