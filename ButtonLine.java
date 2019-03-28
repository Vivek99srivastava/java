import java.awt.*;
import javax.swing.*;
import javax.swing.text.html.*;
public class ButtonLine extends JFrame
        {
        public ButtonLine(String title)
                {
                super(title);
                String s1="<html>"+"Hi Friends"+"<br>"+"Good Morning"+"</html>";
                Panel p1=new Panel();
                
                JButton b1=new JButton(s1);
                p1.add(b1);
                add(p1,BorderLayout.NORTH);
                setSize(300,300);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        public static void main(String args[])
                {
                new ButtonLine("See Multiline Button");
                }
        }





