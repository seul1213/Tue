package chap03;

import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		double average =0.0;//평균
		int count=0;//총합 정수의 갯수
		int sum=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요");
		int n =scan.nextInt();
		while(n!=-1) {//센티널, 보초값 -1
			sum+=n;
			count++;
			n=scan.nextInt();
		}
		if(count>0) {System.out.println("정수의 갯수:"+count);
		average =(double)sum/count;
		System.out.println("평균:"+average+"점");
		}
		else
			System.out.println("정수의 갯수가 0이라, 평균을 구할수 없습니다");
//		if(count==0)System.out.println("입력된 정수가 없습니다");
//		else {
//			System.out.println("정수의 개수는"+count+"개이며");
//			System.out.println("합계은"+(double)sum/count+"입니다");
//		}
		
	}

}
