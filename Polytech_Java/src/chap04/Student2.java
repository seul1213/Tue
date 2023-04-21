package chap04;

public class Student2 {
		//속성(필드)
		private String name;
		private int age;
		private int id;
		
		
		//행위(메소드)
		//생성자 메소드: 초기화를 목적
		public Student2() {}
		public Student2(String name, int age, int id) {
			super();
			this.name = name;
			this.age = age;
			this.id = id;
		}



		//일반메소드
		//다향성:오버로딩(overloading)
		void study(){System.out.println("공부합니다.");}
		void study(String test){System.out.println(test+"공부를합니다.");}
		void eat() {System.out.println("먹습니다");}
		void era(String meat) {System.out.println(meat+"고기를 먹습니다");}
		void sleep() {System.out.println("잡니다");}
		boolean test(String test,int score){
			System.out.println(test+"시험을 봤군요");
		if(score>=60) return true;
		else		  return false;
		}
		//getter &setter(접근자 설정자)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		
		
		
		//main메소드
		public static void main(String[] args) {
			Student2 student=new Student2();//객체명 선언
			student.study();
			if(student.test("정보처리기사", 80))
				System.out.println("합격하셨습니다.");
			else
				System.out.println("불합격하셨습니다.");
			
			
		}
		
		}




