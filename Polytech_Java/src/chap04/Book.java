package chap04;

public class Book {
	//필드: 멤버변수
	String title;
	String author;
	String name ="박슬기";
	//메소드
	//생성자
	Book(){
		System.out.println(name);}
	Book(String title){
		this("","");
		this.title=title;
		this.author="작가미상";}
		//this.title=title;this.author="작가미상";}
	
	Book(String title,String author){
		this.title=title;this.author=author;}
	
	//일반메소드
	void printBook(){
		System.out.println(this.title + ":"+this.author);}
	public static void main(String[] args) {
		Book book= new Book();
		Book littlePrince=new Book("어린왕자","생택쥐베리");
		Book loveStory= new Book("춘향전");
		
		littlePrince.printBook();
		loveStory.printBook();
		book.title ="책이예요";
		System.out.println(book.title);
	}
}
