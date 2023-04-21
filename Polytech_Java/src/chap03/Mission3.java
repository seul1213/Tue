package chap03;

import java.util.Random;
import java.util.Scanner;

//up-down게임
//사용자 :1~99입력
//컴퓨터:1~99까지 값을 생성
//사용자가 컴퓨터 값을 맞추면 게임성공
//사용자>컴퓨터 다운시켜
//사용자<컴퓨터 업시켜
//trial=7회 ->성공 :이겼다 실패 서로횟수 출력 실패했다
//Seed(나수생성 알고리즘이 계수)
public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand=new Random();
		
		int count =0;
		 final int TRY_NUMBER = 7;
		 boolean state =true;
        System.out.println("게임시작");
        rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1+rand.nextInt(3);
		
		while(true) {
			 count++;
				if(count>TRY_NUMBER) {
					state= false;
					break;
		 }
				
				int user =scan.nextInt();
				if(user >com)          System.out.println("down");
			 	else if(user<com)      System.out.println("up");
			 	else   break;	

	}
		 System.out.println("==========================");
		 if(state)System.out.println("이겼다");
		 else System.out.println("실패했다");
		 scan.close();
	}
	}
