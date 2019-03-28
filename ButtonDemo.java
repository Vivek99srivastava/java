import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonDemo extends JFrame implements ActionListener
        {
        JButton b1,b2;
        Container c;
        public ButtonDemo()
                {
                b1=new JButton("Red");
                b2=new JButton("Green");
                b1.addActionListener(this);
                b2.addActionListener(this);
                c=getContentPane();
                c.setLayout(new FlowLayout());
                c.add(b1);
                c.add(b2) ;
                setSize(300,300);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        public static void main(String args[])
                {
                ButtonDemo bb=new ButtonDemo();
                }
        public void actionPerformed(ActionEvent ae)
                {
                if(ae.getSource()==b1)
                        {
                        c.setBackground(Color.red);
                        }else{
                        c.setBackground(Color.green);
                        }
                }
        }









