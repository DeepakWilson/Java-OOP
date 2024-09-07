package javalab;
abstract class Shape{
	abstract void numberOfSides();
}
class Rectangle extends Shape{
		int side;
		Rectangle(int side){
			this.side=side;
		}
		public void numberOfSides(){
		System.out.println("No of sides of Rectangle= "+side);
	}
}
class Triangle extends Shape{
		int side;
		Triangle(int side){
			this.side=side;
		}
	public void numberOfSides() {
		System.out.println("No of sides of trianlge = "+side);
	}
}
class Hexagon extends Shape{
		int side;
		Hexagon(int side){
			this.side=side;
		}
	public void numberOfSides() {
		System.out.println("No of sides of hexagon= "+side);
	}
}
public class abclass {
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(4);
		Triangle tri=new Triangle(3);
		Hexagon hexa=new Hexagon(6);
		rect.numberOfSides();
		tri.numberOfSides();
		hexa.numberOfSides();
	}
}
