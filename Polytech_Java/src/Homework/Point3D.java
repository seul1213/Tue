package Homework;

public class Point3D  extends Point{private String Color;
private int z;

public Point3D(int x, int y,int z) {
	super(x, y); this.z=z;}

public void setColor(String Color)
{this.Color=Color;}
public void setXY(int x, int y)
{super.move(x, y);}
public String getColor() {return Color;}

public void moveUp() {z++;}
public void moveDown() {z--;}
public void move(int x, int y, int z)
{super.move(x, y);this.z=z;}

public int getZ() {return z;}
public String toString()
{return getColor()+"���� ("+getX()+","+getY()+","+getZ()+") �� ���Դϴ�.";}

public static void main(String[] args) {
	Point3D p = new Point3D(1,2,3);
	System.out.println(p.toString());
	
	p.moveUp();
	System.out.println(p.toString()+"�Դϴ�.");
	p.moveDown();
	p.move(10, 10);
	System.out.println(p.toString()+"�Դϴ�.");
	
	p.move(100, 200,300);
	System.out.println(p.toString()+"�Դϴ�.");

}

}
