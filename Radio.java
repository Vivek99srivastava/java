import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Radio extends JApplet implements ActionListener
        {
        JRadioButton b1,b2,b3;
        JTextField tf;
        Font f;
        public void init()
                {
                f=new Font("Arial",Font.BOLD,18);
                b1=new JRadioButton("Java");
                b2=new JRadioButton(".Net");
                b3=new JRadioButton("Oracle");
                b1.setFont(f);
                b2.setFont(f);
                b3.setFont(f);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                tf=new JTextField(18);
                tf.setFont(f);
                Panel p=new Panel();
                p.add(b1);
                p.add(b2);
                p.add(b3);

                Panel pp=new Panel();
                pp.add(tf);

                Container c=getContentPane();
                c.setLayout(new BorderLayout());

                c.add(p);
                c.add(pp,BorderLayout.SOUTH);
                }
        public void actionPerformed(ActionEvent ae)
                {
                if(ae.getSource()==b1)
                        {
                        b1.setEnabled(true);
                        b2.setEnabled(false);
                        b3.setEnabled(false);
                        tf.setText(ae.getActionCommand());
                        }
                else if(ae.getSource()==b2)
                        {
                        b1.setEnabled(false);
                        b3.setEnabled(false);
                        b2.setEnabled(true);
                        tf.setText(ae.getActionCommand());
                        }else{
                        b1.setEnabled(false);
                        b2.setEnabled(false);
                        b3.setEnabled(true);
                        tf.setText(ae.getActionCommand());
                        }
              }
        }
/*<applet code="Radio" width=400 height=300>
</applet>*/















