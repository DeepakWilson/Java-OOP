/*Write a Java program that creates three threads. First thread generates a random positive number (>1) every 1 second.
If the number is even, the second thread prints all even numbers between 1 and the generated number. If the number is odd,
the third thread will print all odd numbers between 1 and the generated number.*/
import java.util.*;
class RandomGenerator extends Thread{
   public void run() {
    int a=0;
    Random rand= new Random();
    try{
        for(int i=2;i<=5;i++){
            a=rand.nextInt(30);
            System.out.println("The generated number is "+a);
            if(a%2==0){
                Thread t1=new Thread(new EvenNum(a));
                t1.start();
            }else{
                Thread t2=new Thread(new OddNum(a));
                t2.start();
            }
            Thread.sleep(1000);
        System.out.println("....................");
        }
        
    }catch(Exception e){
        System.out.println("Error! "+e.getMessage());
    }
}}
class EvenNum extends Thread{
    public int a;
    public EvenNum(int a){
        this.a=a;
    }
    public void run(){
        System.out.println("The even numbers between 1 and"+a+"are= ");
        for(int i=2;i<a;i=i+2){
        System.out.print(i+"\t");   
        }}}
class OddNum extends Thread{
    public int a;
    public OddNum(int a){
        this.a=a;
    }
    public void run(){
        System.out.println("The odd number between 1 and"+a+"are=");
        for(int i=3;i<a;i=i+2){
           System.out.print(i+"\t");
            }}}

public class thread1 {
    public static void main(String[] args) {
        RandomGenerator rno=new RandomGenerator();
        rno.start();
    }
}
