package Homework;

public class ColorPoint  extends Point{
	String Color;  
	public ColorPoint(int x, int y,String z) {
		super(x, y);
		
	}
	 public void setColor(String Color)
	 {this.Color=Color;}
	 public void setXY(int x, int y)
	 {super.move(x, y);}
	 public String getColor() {return Color;}
	
	 public String toString()
	 {return getColor()+"색의 ("+getX()+","+getY()+")의 점";}
	

	

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"yellow");
		cp.setXY(10,20);
		cp.setColor("red");
		String str =cp.toString();
		System.out.println(str+"입니다.");
	

	}

}
