/*Write a java program to create two threads, one for writing odd numbers and another for writing even numbers up to 100 into two different files*/
import java.util.*;
import java.io.*;
class EvenNum extends Thread{
    public void run(){
        try {
            FileWriter fin= new FileWriter("even.txt");
            for(int i=0;i<100;i=i+2){
                fin.write(i+"\t");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
class OddNum extends Thread{
    public void run(){
        try{
            FileWriter fin=new FileWriter("odd.txt");
            for(int i=1;i<100;i=i+2){
                fin.write(i+"\t");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
public class thread3 {
    public static void main(String[] args) {
        EvenNum t1=new EvenNum();
        t1.start();
        OddNum t2=new OddNum();
        t2.start();
        
    }
    
}
