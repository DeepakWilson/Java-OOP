package javalab;
import java.util.Scanner;
public class matrixmultiply {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of 1st matrix");
		int r1=sc.nextInt();
		System.out.println("Enter the columns of 1st matrix");
		int c1=sc.nextInt();
		System.out.println("Enter the rows of 2nd matrix");
		int r2=sc.nextInt();
		System.out.println("Enter the columns of 2nd matrix");
		int c2= sc.nextInt();
	if(c1!=r2) {
		System.out.println("Multiplication not possible");
	}
	else {
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		System.out.println("Enter the elements of the first matrix");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				c[i][j]=0;
			for(int k=0;k<c1;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
			}
		}
//printing
		System.out.println("The entered matrix A is");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(a[i][j]+"\t");
	}
			System.out.println();
	}
		System.out.println("The entered matrix B is");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The product matrix is=");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	}
}
/**/
