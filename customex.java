package javalab;
import java.util.Scanner;
class AgeException extends Exception{
	public AgeException(String Message) {
		super(Message);
	}
}
public class customex {
	public static void ValidateAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("Must be 18");
			}
		System.out.println("Age is Valid"+age);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Voting Eligibility");
		System.out.println("Enter the age");
		int age= sc.nextInt();
		try {
			ValidateAge(age);
		}catch(AgeException e){
			System.out.println("Error:"+e.getMessage());
		}finally {
			System.out.println("Finally block... Always present");
		}
	}
}
