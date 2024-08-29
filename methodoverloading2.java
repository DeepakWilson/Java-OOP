package javalab;
import java.util.Scanner;
class Calc{
	void area(double basetriangle,double heighttriangle) {
		double triangleresult=(basetriangle*heighttriangle)/2;
		System.out.println("The area of triangle is "+triangleresult);
		}
	void area(int widthrectangle, int lengthrectangle) {
		int rectangleresult=(widthrectangle*lengthrectangle);
		System.out.println("The area of rectangle is "+rectangleresult);
	}
	void area(double circleradius) {
		double circleresult=(3.14*circleradius*circleradius);
		System.out.println("The area of circle is "+circleresult);
	}
}
public class methodoverloading2 {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   Calc p= new Calc();
	   System.out.println("Enter the base and height of triangle");
	   double basetriangle= sc.nextDouble();
	   double heighttriangle= sc.nextDouble();
	   p.area(basetriangle,heighttriangle);
	   System.out.println("Enter the width and height of rectangle");
	   int widthrectangle= sc.nextInt();
	   int lengthrectangle=sc.nextInt();
	   p.area(widthrectangle,lengthrectangle);
	   System.out.println("Enter the radius of circle");
	   double circleradius= sc.nextDouble();
	   p.area(circleradius);
	   }
}
