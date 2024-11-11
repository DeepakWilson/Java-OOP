import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class armstrongGUI implements ActionListener {
    JFrame jf;
    JPanel p;
    JButton c;
    JLabel l1;
    JTextField tf;
    armstrongGUI(){
        jf=new JFrame("Armstrong Checker");
        p=new JPanel();
        c=new JButton("Check");
        l1=new JLabel("Input the number to check");
        tf=new JTextField(20);
        p.add(tf);p.add(c);p.add(l1);
        c.addActionListener(this);
        jf.setLayout(new FlowLayout());
        jf.setContentPane(p);
        jf.setSize(400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new armstrongGUI();
    }
    public void actionPerformed (ActionEvent ae){
          
        try{
            if(ae.getSource()==c){
                int n;
                int r,s=0;
                n=Integer.parseInt(tf.getText());
                int c=n;
                while(n>0){
                    r=n%10;
                    s=(r*r*r)+s;
                    n=n/10;
                }
                if(s==c){
                    tf.setText("The number is Armstrong");
                }else{
                    tf.setText("The number is not Armstrong");
                } } }catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                } } }
