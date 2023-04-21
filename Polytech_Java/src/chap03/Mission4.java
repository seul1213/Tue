package chap03;

public class Mission4 {
//1~100까지의 수 중에서
//3의 배수만 합산한 결과(sum)을 출력하라
//13의 배수 이전까지만 합산하라	
	public static void main(String[] args) {
	//1.1~100까지의 숫자 중에 13의 배수만 합산하라
			int sum=0;
			for(int num=1; num<=10; num++) 
				if(num%13==0) sum+=num;
					
	//1.1~100까지의 숫자 중에 13이 되며기 전까지만 합산하라
			sum=0;
			for(int num=1; num<=10; num++) {
				if(num%13==0) break;
				sum+=num;		
		}		
	//3.1~100까지의 숫자 중의 13을 제외한 숫자만 합산하라
			sum=0;
			for(int num=1; num<=10; num++) {
				if(num%13==0) continue;
			sum+=num;	
			}
			
			System.out.println("sum="+sum);
		
}
}