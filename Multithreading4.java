/* Write a program that creates two threads. Fist thread prints the numbers from 1 to 100 and the other 
thread prints the numbers from 100 to 1. Execute the two threads in parallel */

import java.util.*;
class Normal extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Normal number="+i+"\t");
        }}}
class Reverse extends Thread{
    public void run(){
        for(int i=100;i>=1;i--){
            System.out.println("reversed number"+i+"\t");
        }}}
public class thread4 {
    public static void main(String[] args) {
        Normal t1=new Normal();
        t1.start();
        Reverse t2= new Reverse();
        t2.start();
    }
    
}
