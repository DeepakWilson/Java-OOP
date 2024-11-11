/*Create 2 threads : one to print multiples of 5 b/w 1-100 and second to print 
multiples of 10 b/w 100-200. Set suitable priorities for each thread*/
import java.util.*;
class multfive extends Thread{
        public void run(){
        for(int i=1;i<100;i++){
            if(i%5==0)
            System.out.println("Multiple of 5 = "+i);
        }}}
class multten extends Thread{
    public void run(){
        for(int i=100;i<200;i++){
            if(i%10==0)
            System.out.println("Multiple of 10 = "+i);
        }}}
public class Multithreading5 {
    public static void main(String[] args) {
        multfive t1=new multfive();
        t1.start();
        multten t2=new multten();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
    }
    
}
