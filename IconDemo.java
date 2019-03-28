import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IconDemo extends JApplet implements ItemListener
        {
        JLabel l;
        ImageIcon i1,i2,i3;
        Font f;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                JComboBox jc=new JComboBox();
                jc.addItem("car");
                jc.addItem("angel");
                jc.addItem("banner");
                f=new Font("Arial",Font.BOLD,18);
                jc.setFont(f);
                jc.addItemListener(this);
                c.add(jc);
                l=new JLabel(new ImageIcon("test.jpg"));
                c.add(l);
                }
        public void itemStateChanged(ItemEvent ie)
                {
                String s=(String)ie.getItem();
                l.setIcon(new ImageIcon(s+".gif"));
                }
       }
/*<applet code="IconDemo" width=400 height=300>
</applet>*/
















