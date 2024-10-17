package javalab;
import java.util.Scanner;
public class vowelstring{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
               count++;
		}
		
	}
		System.out.println("No of vowels are"+count);

}
}
/**/
