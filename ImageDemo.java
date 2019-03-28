import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ImageDemo extends JApplet implements ActionListener
        {
        JTextField tf;
        JButton b1,b2,b3;
        ImageIcon i1,i2,i3;
        Font f;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                i1=new ImageIcon("angel.gif");
                b1=new JButton(i1);
                b1.setActionCommand("Angel");
                b1.addActionListener(this);

                i2=new ImageIcon("car.gif");
                b2=new JButton(i2);
                b2.setActionCommand("Car");
                b2.addActionListener(this);

                i3=new ImageIcon("banner.gif");
                b3=new JButton(i3);
                b3.setActionCommand("Banner");
                b3.addActionListener(this);

                tf=new JTextField(15);
                tf.setFont(new Font("Arial",Font.BOLD,18));
                b1.setFont(new Font("Arial",Font.BOLD,18));
                b2.setFont(new Font("Arial",Font.BOLD,18));
                b3.setFont(new Font("Arial",Font.BOLD,18));

                c.add(tf);
                c.add(b1);
                c.add(b2);
                c.add(b3);
                }
        public void actionPerformed(ActionEvent ae)
                {
                tf.setText(ae.getActionCommand());
                }
        }
/*<applet code="ImageDemo" width=400 height=300>
</applet>*/


















