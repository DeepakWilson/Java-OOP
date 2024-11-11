/*Write a Java program that creates multiple child threads to print odd and even numbers from 50-100.*/
import java.util.*;
class EvenNum extends Thread{
    public void run(){
        for(int i=50;i<100;i=i+2){
            System.out.println("Even num="+i+"\t");
        }}}
class OddNum extends Thread{
    public void run(){
        for(int i=51;i<100;i=i+2){
            System.out.println("Odd num="+i+"\t");
        }}}
public class thread2 {
    public static void main(String[] args) {
        Thread t1=new Thread(new EvenNum());
        t1.start();
        Thread t2=new Thread(new OddNum());
        t2.start();
    }
}
