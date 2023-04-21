package chap02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
	System.out.print("정수 입력(10~99) >>");
	 int 정수 = scan.nextInt();
	 int 십의자리=정수/10;
	 int 일의자리=정수%10;
	 //조건 연산자
//	 String msg =(십의자리 == 일의자리) ? "YES! 십의 자리와 일의 자리가 갑습니다.":
//	 "NO! 같지 않습니다.";
//	 System.out.println(msg);
	 
	 //조건식 if 활용
	 String msg;
	 if(십의자리 == 일의자리)
		 {msg ="YES! 십의 자리와 일의 자리가 갑습니다.";}
	 else
		 {msg ="NO! 같지 않습니다.";}
	 System.out.println(msg);
	 
	}

}
