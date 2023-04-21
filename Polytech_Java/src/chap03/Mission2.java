package chap03;
import java.util.Random;
// user 와 com
//user는 1,2,3 -가위 바위 보
//com은 random 하게 컴퓨터가 생성한다.
//1회의 게일을 하고 누가 이겼는지 화면에 출력하라!
//if 또는 switch 중에 결정해서 프로그램 작성
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		1)Math.random() 메소드를 활용해서 난수를 생성
//		int com =(int)(1+Math.random()*3);
		
		//2) Random() 클래스의 nexInt, nextDouble..
		Random rand = new Random();
		 int count =0;
		 final int TRY_NUMBER = 10;
		 boolean state =true;
         
		 while(true){
			count++;
			if(count>TRY_NUMBER) {
				state= false;
				break;
			}
			
			rand.setSeed(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis());
			int com = 1+rand.nextInt(3);
			 
			 
			 System.out.print("가위(1),바위(2), 보(3) >>");
		 	 int user =scan.nextInt();
		 	
		 	 if(com==1)      System.out.println("컴퓨터:가위");
		 	 else if(com==2) System.out.println("컴퓨터:바위");
		 	 else            System.out.println("컴퓨터:보");
		 	 
		 	int result =user-com;
		 	 if(result==0)                    System.out.println("무승부");
		 	 else if(result==-1 || result==2 )System.out.println("컴퓨터 승!");
		 	 else {                            System.out.println("사용자 승!");
		 	 break;}
		 	 }
		 System.out.println("==========================");
		 if(state)System.out.println("당신의 승리");
		 else System.out.println("시도횟수 초과!");
	}
	 }
         
//	 	 System.out.println("컴퓨터"+com);
	 	 
//	 	 if(com==user) {
//	 		 System.out.println("비겼습니다");}
//	 	 else if(com==1) {
//	 		 if(user==2)
//	 		 System.out.println("이겼습니다");
//	 		 if(user==3)
//	 			 System.out.println("졌습니다");}
//	 	else if(com==2) {
//	 		 if(user==1)
//	 		 System.out.println("졌습니다");
//	 		 if(user==3)
//	 			 System.out.println("이겼습니다");}
//	 	else if(com==3) {
//	 		 if(user==1)
//	 		 System.out.println("이겼습니다");
//	 		 if(user==2)
//	 			 System.out.println("졌습니다");}
	 	 
	
	 		

