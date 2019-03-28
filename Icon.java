import java.awt.*;                                        
import javax.swing.*;
public class Icon extends JApplet
        {
        public void init()
                {
                Container c=getContentPane();
                ImageIcon ii=new ImageIcon("banner.gif");
                JLabel l=new JLabel("Interface Software",ii,JLabel.CENTER);
                c.add(l);
                }
        }
/*<applet code="Icon" width=400 height=300>
</applet>*/
