package javalab;
import java.util.*;
import java.io.*;
public class filereaderandwriter {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			File obj1= new File("register1.txt");
			obj1.createNewFile();
			System.out.println("Register1.txt has been added");
			FileWriter fout= new FileWriter("register1.txt");
			System.out.println("Enter your keam rank");
			int n= sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("Data Added");
			FileReader fin= new FileReader("register1.txt");
			BufferedReader br= new BufferedReader(fin);
			String str;
			System.out.println("The contents of file");
			while((str= br.readLine())!= null) {
					System.out.println(str);
			}
			br.close();
			sc.close();
		}catch(IOException e){
			System.out.println("Error has Occured "+e.getMessage());
		}
	}

}
