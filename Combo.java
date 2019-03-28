import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Combo extends JApplet implements ItemListener
        {
        JComboBox cb;
        JTextField tf;
        Font f;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                c.setBackground(Color.pink);
                f=new Font("Arial",Font.BOLD,20);
                String str[]={"MBA","MCA","Btech","Mtech"};
                cb=new JComboBox(str);
                tf=new JTextField(10);
                tf.setEditable(false);
                tf.setFont(f);
                cb.setFont(f);
                cb.addItemListener(this);
                c.add(cb);
                c.add(tf);
                }
        public void itemStateChanged(ItemEvent ie)
                {
                String str=(String)cb.getSelectedItem();
                tf.setText(str);
                }
        }
/*<applet code="Combo" width=400 height=300>
</applet>*/














