import java.util.*;
class Table{
    void printTable(int n){
        synchronized(this){
        System.out.println("The table is");
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(""+e.getMessage());
            }}}}}
class MyThread1 extends Thread{
    int n;
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(n);
    }}

class MyThread2 extends Thread{
        int n;
        Table t;
        MyThread2(Table t){
            this.t=t;
        }
        public void run(){
            t.printTable(n);
     }}

public class ThreadSynch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Table t=new Table();
        MyThread1 th1 = new MyThread1(t);
        MyThread2 th2 = new MyThread2(t);
        System.out.println("num 1=");
        th1.n=sc.nextInt();
        System.out.println("num 2");
        th2.n=sc.nextInt();
        th1.start();
        th2.start();
        }}

