import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Trafficlights implements ActionListener{
    JRadioButton r,y,g;
    JPanel p;
    Color redColor,yellowColor,greenColor;
    Trafficlights(){
        JFrame jf= new JFrame("Traffic Light Simulator");
        p= new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                drawlights(g);
            }
        };
        p.setLayout(null);
        p.setBackground(Color.white);

        r= new JRadioButton("Red");
        y=new JRadioButton("Yellow");
        g=new JRadioButton("Green");

        r.setBounds(20,20,70,30);
        y.setBounds(20, 50, 70, 30);        /*Set Bounds */
        g.setBounds(20,80,70,30);

        redColor=Color.RED;
        yellowColor=p.getBackground();              /*initial condition */
        greenColor=p.getBackground();

        ButtonGroup br= new ButtonGroup();
        br.add(r);
        br.add(y);                              /*Make sure only one button in the group executes */
        br.add(g);

        p.add(r);
        p.add(y);
        p.add(g);

        r.addActionListener(this);
        y.addActionListener(this);
        g.addActionListener(this);

        jf.setContentPane(p);
        jf.setVisible(true);
        jf.setSize(400,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Trafficlights();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==r){
            redColor=Color.RED;
            yellowColor=p.getBackground();
            greenColor=p.getBackground();
        }else if(ae.getSource()==y){
            redColor=p.getBackground();
            yellowColor=Color.YELLOW;
            greenColor=p.getBackground();
        }else if(ae.getSource()==g){
            redColor=p.getBackground();
            yellowColor=p.getBackground();
            greenColor=Color.GREEN;
        }
        p.repaint();
    }
    private void drawlights(Graphics g){
        g.drawOval(100,50,50,50);
        g.drawOval(100,100,50,50);
        g.drawOval(100,150,50,50);
        g.setColor(redColor);
        g.fillOval(100,50,50,50);
        g.setColor(yellowColor);
        g.fillOval(100,100,50,50);
        g.setColor(greenColor);
        g.fillOval(100,150,50,50);
  }
}
