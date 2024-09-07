package javalab;
import java.util.Scanner;
class employee{
	double salary,gross_sal,da,hra;
	employee(double salary,double da, double hra){
	this.salary= salary;
	this.da=da;
	this.hra=hra;
	}
	void display() {
		System.out.println("***EMPLOYEE***\n");
	}
	void calcsalary() {
		gross_sal= salary+salary*(da/100)+salary*(hra/100);
		System.out.println("The gross salary is "+gross_sal);
	}
}
class Engineer extends employee{
	Engineer(double salary, double da, double hra)
	{
		super(salary,da,hra);
	}
	void display() {
	     super.display();
	     super.calcsalary();
	     System.out.println("\n***ENGINEER***\n");
	     }
	void calcsalary() {
		System.out.println("The gross salary is "+gross_sal*2);
	}
}
public class methodoverriding {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary of Employee");
		double salary= sc.nextDouble();
		System.out.println("Enter the DA% of Employee");
		double da= sc.nextDouble();
		System.out.println("Enter the HRA% of Employee");
		double hra=sc.nextDouble();
		Engineer job= new Engineer(salary,da,hra);
		job.display();
		job.calcsalary();
	}
}
