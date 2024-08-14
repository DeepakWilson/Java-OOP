import java.util.Scanner;
public class naturno {
    public static void main (String args[]){
        int i=1,fac=1;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no");
        int n= num.nextInt();
        System.out.println("The factorial is");
        while(i<=n)
        {
            fac=fac*i;
            i++;
        }
        System.out.println( +fac );
    }
    
}
