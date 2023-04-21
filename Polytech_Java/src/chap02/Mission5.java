package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("돈 입력하세요>>");
		 int money = scan.nextInt();
		 int 오만원권 =money/50000;
		 int res =(money%50000);
		 int 만원권 =res/10000;
		 res =(money%10000);
		 int 천원권 =money/1000;
		 res =(money%1000);
		 int 백원권 =money/100;
		 res =(money%100);
		 int 오십원권 =money/50;
		 res=(money%50);
		 int 십원권 =money/10;
		 res=(money%10);
		 int 일원권 =money/50000;
		 res =(money%1000);
		 System.out.println("오만원권:" +오만원권 );
		 System.out.println("만원권 :" +만원권 );
		 System.out.println("천원권 :" +천원권 );
		 System.out.println("백원권 :" +백원권 );
		 System.out.println("오십원권:" +십원권 );
		 System.out.println("일원권 :" +일원권 );

	}

}
