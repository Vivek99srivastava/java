import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tabbed extends JApplet
        {
        public void init()
                {
                Container c=getContentPane();
                JTabbedPane tp=new JTabbedPane();
                tp.addTab("Cities",new CitiesPanel());
                tp.addTab("Colors",new ColorsPanel());
                tp.addTab("Flavors",new FlavorsPanel());
                c.add(tp);
                }
       }
class CitiesPanel extends JPanel
        {
        public CitiesPanel()
                {
                JButton b1=new JButton("New Delhi");
                JButton b2=new JButton("New York");
                JButton b3=new JButton("Tokyo");
                add(b1);
                add(b2);
                add(b3);
                }
        }
class ColorsPanel extends JPanel
        {
        public ColorsPanel()
                {
                JCheckBox cb1=new JCheckBox("Red");
                JCheckBox cb2=new JCheckBox("Green");
                JCheckBox cb3=new JCheckBox("Blue");
                add(cb1);
                add(cb2);
                add(cb3);
                }
        }
class FlavorsPanel extends JPanel
        {
        public FlavorsPanel()
                {
                JComboBox box=new JComboBox();
                box.addItem("Vanilla");
                box.addItem("Chocolate");
                add(box);
                }
        }
/*<applet code="Tabbed" width=400 height=400>
</applet>*/




























