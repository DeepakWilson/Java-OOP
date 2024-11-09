import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calca1 implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    int n=0,i=0;
    JTextField tf;
calca1(){
    JFrame jf= new JFrame("Calculator");
    JPanel p= new JPanel();
    tf= new JTextField();
    tf.setBounds(100,100,200,30);
    b1=new JButton("1"); b2= new JButton("2"); b3= new JButton("3"); b4= new JButton("+");
    b5=new JButton("4"); b6= new JButton("5"); b7= new JButton("6"); b8= new JButton("-");
    b9=new JButton("7"); b10= new JButton("8"); b11= new JButton("9"); b12= new JButton("*");
    b13=new JButton("0"); b14= new JButton("="); b15= new JButton("AC"); b16= new JButton("/");
    b1.setBounds(100, 140, 50, 30);b2.setBounds(150, 140, 50, 30);b3.setBounds(200, 140, 50, 30);b4.setBounds(250, 140, 50, 30);
    b5.setBounds(100, 170, 50, 30);b6.setBounds(150, 170, 50, 30);b7.setBounds(200, 170, 50, 30);b8.setBounds(250, 170, 50, 30);
    b9.setBounds(100, 200, 50, 30);b10.setBounds(150, 200, 50, 30);b11.setBounds(200, 200, 50, 30);b12.setBounds(250, 200, 50, 30);
    b13.setBounds(100, 230, 50, 30);b14.setBounds(150, 230, 50, 30);b15.setBounds(200, 230, 50, 30);b16.setBounds(250, 230, 50, 30);
    p.add(tf);
    p.add(b1);p.add(b2);p.add(b3);p.add(b4);
    p.add(b5);p.add(b6);p.add(b7);p.add(b8);
    p.add(b9);p.add(b10);p.add(b11);p.add(b12);
    p.add(b13);p.add(b14);p.add(b15);p.add(b16);
    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
    b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
    b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
    b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);
    jf.setContentPane(p);
    jf.setSize(400, 500);
    jf.setLayout(null);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String [] args){
    new calca1();
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1) tf.setText(tf.getText()+"1");
    else if(ae.getSource()==b2) tf.setText(tf.getText()+"2");
    else if(ae.getSource()==b3) tf.setText(tf.getText()+"3");
    else if(ae.getSource()==b5) tf.setText(tf.getText()+"4");
    else if(ae.getSource()==b6) tf.setText(tf.getText()+"5");
    else if(ae.getSource()==b7) tf.setText(tf.getText()+"6");
    else if(ae.getSource()==b9) tf.setText(tf.getText()+"7");
    else if(ae.getSource()==b10) tf.setText(tf.getText()+"8");
    else if(ae.getSource()==b11) tf.setText(tf.getText()+"9");
    else if(ae.getSource()==b13) tf.setText(tf.getText()+"0");
    else if (ae.getSource()==b4){
        n=Integer.parseInt(tf.getText());
        tf.setText("");
        i=1;
    }else if (ae.getSource()==b8){
        n=Integer.parseInt(tf.getText());
        tf.setText("");
        i=2;
    }else if (ae.getSource()==b12){
        n=Integer.parseInt(tf.getText());
        tf.setText("");
        i=3;
    }else if (ae.getSource()==b16){
        n=Integer.parseInt(tf.getText());
        tf.setText("");
        i=4;
    }else if (ae.getSource()==b14){
        calculate();
    }else if (ae.getSource()==b15){
        tf.setText("");
        n=0;
        i=0;
    }
}
private void calculate(){
    int res=0;
    int secondOperand;
 try{
    secondOperand=Integer.parseInt(tf.getText());
    switch(i){
        case 1: res=n+secondOperand;
        break;
        case 2: res=n-secondOperand;
        break;
        case 3: res=n*secondOperand;
        break;
        case 4: if(secondOperand!=0){
                res=n/secondOperand;
        }else{ 
                tf.setText("Division by Zero");
                return;
        }
        break;
        default: return;
    }
    tf.setText(Integer.toString(res));
 }catch(NumberFormatException e){
    tf.setText("ERROR");
 }}}
