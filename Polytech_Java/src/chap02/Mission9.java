package chap02;
//switch 문 활용
//사용자로부터 month 를 정수로 입력받아서
//month의 days를 출력해주세요
//month :2-28,46911-30일, 기타
import java.util.Scanner;
public class Mission9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("월(1~12)>>");
		int month =scan.nextInt();
		int days =0;
		
		switch(month) {
		case 2:
			days =28;
			break;
		case 4:case 6:case 9:case 11:
			days =30;
			default:
			days =31;
			break;	
		}
		System.out.println(month+"월은"+days+"입니다");
	}
	

}
