package javalab;
import java.util.Scanner;
class Employee{
	String name;
	String address;
	int age;
	long phone;
	double salary;
	Employee(String name1,int age1, long phone1,String address1,double salary1){
		name= name1;
		age= age1;
		phone= phone1;
		address= address1;
		salary=salary1;
	}
	void printEmployee() {
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Phone number= "+phone);
		System.out.println("Address= "+address);
	}
	void printSalary() {
		System.out.println("The salary is "+salary);
}
}
class Officer extends Employee{
		String specialization;
	    Officer(String name1,int age1, long phone1,String address1,double salary1,String specialization1){
	    super(name1,age1,phone1,address1,salary1);
	    specialization= specialization1;
	    }
	    void printSpecialization() { 
		System.out.println(name+" is specialized in "+specialization);
	}
	    }
class Manager extends Employee{
	String department;
	Manager(String name1,int age1, long phone1,String address1,double salary1,String department1){
		super(name1,age1,phone1,address1,salary1);
		department= department1;
	}
	void printDepartment() {
		System.out.println(name+" is from "+department);
	}
}
public class Hinheritance {
  public static void main(String[] args) {
	  String name,address,specialization,department;
	  int age;
	  double salary;
	  long phone;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the name of the Officer= ");
	  name= sc.next();
	  System.out.println("Enter the age");
	  age= sc.nextInt();
	  System.out.println("Enter the phone no");
	  phone= sc.nextInt();
	  System.out.println("Enter the address");
	  address= sc.next();
	  System.out.println("Enter the salary");
	  salary= sc.nextDouble();
	  System.out.println("Enter specialisation");
	  specialization= sc.next();
	  Officer o= new Officer(name,age,phone,address,salary,specialization);
	  
	  System.out.println("Enter the name of the Manager");
	  name= sc.next();
	  System.out.println("Enter the age");
	  age= sc.nextInt();
	  System.out.println("Enter the phone no");
	  phone=sc.nextInt();
	  System.out.println("Enter the address");
	  address= sc.next();
	  System.out.println("Enter the salary");
	  salary=sc.nextDouble();
	  System.out.println("Enter Department");
	  department= sc.next();
	  Manager m= new Manager(name,age,phone,address,salary,department);
	  System.out.println("THE DETAILS OF THE OFFICER IS");
	  o.printEmployee();
	  o.printSalary();
	  o.printSpecialization();
	  System.out.println("THE DETAILS OF MANAGER IS ");
	  m.printEmployee();
	  m.printSalary();
	  m.printDepartment();
	  
   }
}
