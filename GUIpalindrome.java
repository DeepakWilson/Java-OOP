/*4.	Create a GUI with following components to check whether a string is palindrome or not
A label displaying”Enter a string”
A textfield for entering a string
A button labelled “check” . After clicking the check button, if the string entered in the textfield is a palindrome string, 
Display the message” The string is palindrome” else Display the message” The string is not  palindrome” */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIPalindrome implements ActionListener{
    JTextField tf;
    JLabel l;
    JButton c;
    GUIPalindrome(){
        JFrame jf= new JFrame("Check palindrome");
        JPanel p= new JPanel();
        JLabel l= new JLabel("Enter the string");
        tf=new JTextField(20);
        c=new JButton("Check");
        p.add(l);p.add(tf);p.add(c);
        c.addActionListener(this);
        jf.setLayout(new FlowLayout());
        jf.setSize(400,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(p);
    }
    public static void main(String[] args) {
        new yeyeye();
    }
    public void actionPerformed(ActionEvent ae){
        int flag=0;
        if(ae.getSource()==c){
            String s= tf.getText();
            int len=s.length();
            for(int i=0;i<len/2;i++){
                if(s.charAt(i)!=s.charAt(len-i-1)){
                    tf.setText("Not a palindrome");
            }else{
                tf.setText("it is palindrome");
            }}}}}
