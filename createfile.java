package javalab;
import java.io.File;
import java.io.IOException;
public class createfile {
	public static void main(String[] args) {
	try {
		File myObj= new File("1.txt");
		if(myObj.createNewFile()) {
			System.out.println("File created:"+myObj.getName());
		}else {
			System.out.println("File exists already");
		}
	}catch(IOException e) {
		System.out.println("An error occured- ");
		e.printStackTrace();
	}
	}
}
/**/
