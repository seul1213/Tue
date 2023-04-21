package chap03;

public class Mission14 {

	
	public Mission14(){}//생성자
	
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나눌수가 없어요");
			//e.printStackTrace();
		}
		
		

	}

}
