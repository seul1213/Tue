package Homework;

public class ColorPoint1 extends Point{
	String Color;  
	public ColorPoint1(int x, int y) {super(x, y);}
	public ColorPoint1() {super(0,0); Color="black";}
	
	 public void setColor(String Color)
	 {this.Color=Color;}
	 public void setXY(int x, int y)
	 {super.move(x, y);}
	 public String getColor() {return Color;}
	
	 public String toString()
	 {return getColor()+"색의 ("+getX()+","+getY()+")의 점";}
	
	
	public static void main(String[] args) {
		ColorPoint1 zeroPoint =new ColorPoint1();
		System.out.println(zeroPoint.toString());
		
		ColorPoint1 cp =new ColorPoint1(10,10);
		cp.setXY(5, 5);
		cp.setColor("red");
		System.out.println(cp.toString()+"입니다");

	}

}
