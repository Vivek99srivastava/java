import java.awt.*;
import javax.swing.*;
public class Toolbar extends JFrame
        {
        public Toolbar()
                {
                Container c=getContentPane();
                JToolBar bar=new JToolBar("ToolBar",JToolBar.HORIZONTAL);
                JButton cut=new JButton(new ImageIcon("cut.gif"));
                JButton copy=new JButton(new ImageIcon("copy.gif"));
                bar.add(cut);
                bar.add(copy);
                c.setLayout(new BorderLayout());
                c.add(bar,BorderLayout.NORTH);
                setUndecorated(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400,400);
                setVisible(true);
                }
        public static void main(String args[])
                {
                new Toolbar();
                }
        }







