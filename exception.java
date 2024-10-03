package javalab;
import java.util.Scanner;
public class exception {
	public static void main(String args[]) {
			Scanner sc= new Scanner(System.in);
			char ch;
			do {
			System.out.println("CHOOSE AN OPTION");
			System.out.println("1. Arithmetic");
			System.out.println("2. Array access");
			int choice= sc.nextInt();
			switch(choice)
			{
			case 1: 
			try {   System.out.println("Enter a numerator");
					int numerator=sc.nextInt();
					System.out.println("Enter a denominator");
					int denominator=sc.nextInt();
					int ans= numerator/denominator;
					System.out.println("The quotient is "+ans);
			    } 
			catch(ArithmeticException e){
				System.out.println("Caught an exception -"+e.getMessage());
			}
			break;
			case 2:
				int a[]= {1,2,3};
			try {   
					System.out.println("Enter an index to print");
					int in= sc.nextInt();
					System.out.println("Element at index "+in+" is "+a[in]);
				}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught an exception -"+e.getMessage());
			}
			break;
			default:
				System.out.println("Enter a valid choice 1 OR 2");
				break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			ch= sc.next().charAt(0);
}while(ch=='y');
	}
}



