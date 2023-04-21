package chap03;

import java.util.Scanner;

public class Mission9 {

	public static void main(String[] args) {
		double average =0.0;//평균
		int count=0;//총합 정수의 갯수
		int sum=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 (띄어쓰기):");
		int n =0;
		
		do {
			sum +=n;
			count++;
			n=scan.nextInt();
		}while(n!=-1); {//센티널, 보초값 -1
		count= count-1;
		if(count>0) {System.out.println("정수:"+count+"개");
		average =(double)sum/count;
		System.out.printf("평균:%.2f",average);
		}
		else
			System.out.println("정수의 갯수가 0이라, 평균을 구할수 없습니다");

	}
	}
}
