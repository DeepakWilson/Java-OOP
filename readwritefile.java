package javalab;
import java.io.*;
public class readwritefile {
	public static void main(String args[]) {
		try {
		FileInputStream fin= new FileInputStream("Deepak.txt");
		FileOutputStream fout= new FileOutputStream("Deepk.txt");
		int i;
		while((i=fin.read())!=-1){
				fout.write(i);
			}
			System.out.println("Successfully wrote to specific file");
			fin.close();
			fout.close();
		}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
	}
}
