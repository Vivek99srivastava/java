import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Check extends JApplet implements ItemListener
        {
        JTextField tf;
        JCheckBox cb1,cb2,cb3;
        Font f;
        //JTextArea ta;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new BorderLayout());
                Panel p=new Panel();
                f=new Font("Arial",Font.BOLD,18);
                cb1=new JCheckBox("Java");
                cb1.addItemListener(this);
                cb1.setFont(f);

                cb2=new JCheckBox(".Net");
                cb2.addItemListener(this);
                cb2.setFont(f);

                cb3=new JCheckBox("Oracle");
                cb3.addItemListener(this);
                cb3.setFont(f);

                //ta=new JTextArea(10,18);
                //ta.setFont(f);

                p.add(cb1);
                p.add(cb2);
                p.add(cb3);
                //p.add(ta);

                Panel pp=new Panel();
                tf=new JTextField(18);
                tf.setFont(f);
                pp.add(tf);

                c.add(p);
                c.add(pp,BorderLayout.SOUTH);
                }
        public void itemStateChanged(ItemEvent ie)
                {
                if(ie.getStateChange()==ItemEvent.SELECTED)
                        {
                        JCheckBox cc=(JCheckBox)ie.getItem();
                        tf.setText("Current Selected Item is : "+cc.getLabel());
                        //ta.append(cc.getLabel()+"\n");
                        }else if(ie.getStateChange()==ItemEvent.DESELECTED)
                                {
                                tf.setText("");
                                }else{
                                tf.setText("");
                                }
                        }
                }
/*<applet code="Check" width=400 height=300>
</applet>*/
















