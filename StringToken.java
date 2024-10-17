package javalab;
import java.util.Scanner;
public class StringToken {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the line of integers");
		String s= sc.nextLine();
		StringTokenizer s= new StringTokenizer(s," ");
		while(s.hasMoreTokens()) {
			String a= s.nextToken();
			int n= Integer.parseInt(a);
			sum=+n;
		}
		System.out.println("The total sum= "+a);
	}

}
