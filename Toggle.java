
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Toggle extends JFrame implements ActionListener
        {
        ImageIcon i1,i2;
        JToggleButton b1;
        Font f;
        public Toggle()
                {
                setTitle("Toggle Button");
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                i1=new ImageIcon("bird.gif");
                //i2=new ImageIcon("tiger.gif");
                b1=new JToggleButton("Bird",i1);
                f=new Font("Arial",Font.BOLD,30);
                b1.setFont(f);
                b1.addActionListener(this);
                b1.setSize(400,400);
                c.add(b1);
                setSize(400,400);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
                }
        public void actionPerformed(ActionEvent ae)
                {
                if(b1.isSelected())
                        {
                        b1.setIcon(new ImageIcon("banner.gif"));
                        b1.setText("Banner");
                        }else{
                        b1.setIcon(i1);
                        b1.setText("Bird");
                        }
                }                   
        public static void main(String args[])
                {
                Toggle tt=new Toggle();
                }
       }
/*<applet code="Toggle" width=400 height=400>
</applet>*/



















