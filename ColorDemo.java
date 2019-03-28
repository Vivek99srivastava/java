import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorDemo extends JApplet implements ActionListener
        {
        JColorChooser cc;
        JButton jb;
        public void init()
                {
                cc=new JColorChooser();
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                jb=new JButton("I Like Java");
                jb.setFont(new Font("Verdana",Font.BOLD,34));
                
                c.add(cc);
                c.add(jb);
                jb.addActionListener(this);
                }
        public void actionPerformed(ActionEvent te)
                {
                Color ca=cc.getColor();
                jb.setBackground(ca);
                }
        }
/*<applet code="ColorDemo" width=400 height=400>
</applet>*/
