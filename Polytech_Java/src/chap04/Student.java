package chap04;

 class Student {
	//필드선언
	String dept;
	int id;

	
	
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept="스마트소프트웨어 학과";
		student.id=2023000111;
		System.out.println(student.dept+":"+student.id);
		
	}
}
