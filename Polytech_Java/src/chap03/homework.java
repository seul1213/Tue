package chap03;



public class homework {

	public static void main(String[] args) {
		
		
		for(int num=1; num<100; num++) {
		
		int a =num/10;
		int b =num%10;
		
		if(num!=0 && num>=1 && num<=99) {
		if((a==3||a==6||a==9) &&(b==3||b==6||b==9))
		System.out.println(num+"¹Ú¼öÂ¦Â¦");
		
		else if((a==3||a==6||a==9)||(b==3||b==6||b==9))
			System.out.println(num+"¹Ú¼öÂ¦");}
		
		else System.out.println("");

	}
	}
}
