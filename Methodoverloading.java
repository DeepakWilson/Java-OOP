package javalab;

class Overload{
void area(double r) {
	double area=(3.14*r*r);
	System.out.println("The area of circle is ="+area);
	}
void area(int a, int b) {
	int area= (a*b);
	System.out.println("The area of rectangle is="+area);
}
void area(double b,double h) {
	double area=(b*h)/2;
	System.out.println("The area of triangle is="+area);
}
}
public class Methodoverloading {
	public static void main(String[] args) {
		Overload obj=new Overload();
		obj.area(4.5);
		obj.area(5,2);
		obj.area(6.1,2.33);
	}
}
