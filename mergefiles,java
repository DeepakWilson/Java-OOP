/*Create 3 files, file1 odd numbers,  file 2 even numbers, file 3 merge (file1 and file 2)*/

import java.io.*;
public class mergefiles {
    public static void main(String[] args) {
       try{
        File obj1=new File("Evennum.txt");
        obj1.createNewFile();
        FileWriter fout1= new FileWriter("Evennum.txt");
        for(int i=0;i<=20;i=i+2){
            fout1.write(i);
        }
        fout1.close();
        File obj2=new File("Oddnum.txt");
        obj2.createNewFile();
        FileWriter fout2= new FileWriter("Oddnum.txt");
        for(int j=1;j<=20;j=j+2){
            fout2.write(j);
        }
        fout2.close();
        File obj3=new File("Merged.txt");
        obj3.createNewFile();
        FileReader fin1= new FileReader("Evennum.txt");
        BufferedReader br1=new BufferedReader(fin1);
        FileReader fin2= new FileReader("Oddnum.txt");
        BufferedReader br2=new BufferedReader(fin2);
        String line;
        FileWriter fout3= new FileWriter("Merged.txt");
        while((line=br1.readLine())!=null){
            fout3.write(line+"\t");
        }
        while((line=br2.readLine())!=null){
            fout3.write(line+"\t");
        }
      }catch(IOException e){
        System.out.println(e.getMessage());
      }}}
