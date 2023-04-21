package chap03;

import java.util.Random;
import java.util.Scanner;
public class UpDown {
	
public static void main(String[] args) {

		
		while(true) {
			Random rand = new Random();
			int card = rand.nextInt(100);//0~99까지 랜덤한 숫자 받기
			Scanner scan = new Scanner(System.in);
			int num =0;
			System.out.println("수를 결정하였습니다. 맞추어보세요");
		
		while(num!=card) {//입력된 숫자와 임의의 숫자가 일치할때 까지 반복
			  num =scan.nextInt();
			if(num> card)
				System.out.println("down");
			else if(num<card)
				System.out.println("up");
			else//일치시 반복문을 빠져나감
			break;
}
			if(card == num) {
				System.out.println("정답");
				System.out.println("다시 하겠습니까?(y/n)");
				String answer = scan.next();
			if(answer.equals("n")) {
				System.out.println("종료");
				break;
			}
			else if(answer.equals("y"))
				continue;
			}scan.close();
		}
	
	}

}
