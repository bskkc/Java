package Exercises;

import java.util.Scanner;
public class Rectangle {
	String color;
	int width;
	int height;
	
	//Constructors
	public Rectangle()
	{
		width=5;
		height=5;
		color="black";
	}
	
	public Rectangle(int w,int h,String c)
	{
		width=w;
		height=h;
		color=c;		
	}
	
	public Rectangle(Rectangle r)
	{
		width=r.width;
		height=r.height;
		color=r.color;
	}
	
	public void changeColor(String c)
	{
		color=c;
		System.out.println("New color is "+color);
	}
	
	public void changeColor()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the new color:");
		color=s.next();
		System.out.println("New color is: "+color);
	}
	
	public static void swap(Rectangle r1, Rectangle r2)
	{
		String temp1=r1.color;
		r2.color=r1.color;
		r2.color=temp1;
	}
	
	public void equals(Rectangle r)
	{
		if(this.color==r.color && this.height==r.height && this.width==r.width)
		{
			System.out.println("These two rectangles are equal.");
		}
		else
			System.out.println("These two rectangles are NOT equal.");
	}
	
	public String toString()
	{
		return "Width ="+ width + ", Height=" + height + ", Color=" + color;
	}

	public static void main(String[] args) {

		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle(a);		
		a.equals(b);
		b.changeColor();
		a.changeColor("red");
		a.equals(b);
		
		Rectangle c = new Rectangle(5,8,"Brown");
		Rectangle d = new Rectangle(3,5,"Green");
		d.changeColor();
		swap(c,d);
		c.equals(d);
	}
}
