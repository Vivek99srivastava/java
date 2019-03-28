import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Desktop extends JFrame implements MenuListener
        {
        JDesktopPane d;
        JInternalFrame f;
        public Desktop()
                {
                JFrame frame=new JFrame();
                frame.setTitle("JDesktopPane");        
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                d=new JDesktopPane();
                try{
                String str=JOptionPane.showInputDialog(null,"Enter number of Frame u want to create : ","Sai Ram",1);
                int i=Integer.parseInt(str);
                for(int j=1;j<=i;j++)
                        {
                        f=new JInternalFrame("Internal Frame : "+j,true,true,true,true);
                        f.setBounds(j*20,j*20,150,120);
                        f.setVisible(true);
                        d.add(f);
                        f.setToolTipText("Internal Frame : "+j);
                        }
                }catch(NumberFormatException ne)
                        {
                        JOptionPane.showMessageDialog(null,"Please enter a number","Sai Ram",1);
                        System.exit(0);
                        }
                JMenuBar m=new JMenuBar();
                JMenu count=new JMenu("Count Total Frame");
                count.addMenuListener(this);
                m.add(count);
                frame.setJMenuBar(m);
                frame.add(d);
                frame.setSize(450,450);
                frame.setVisible(true);
                }
        public void menuSelected(MenuEvent me)
                {
                int i=d.getAllFrames().length;
                JOptionPane.showMessageDialog(null,"Total Number of Visible Internal Frames are : "+i,"Sai Ram",1);
                }
        public void menuCanceled(MenuEvent me){}
        public void menuDeselected(MenuEvent me){}
        public static void main(String args[])
                {
                new Desktop();
                }
        }






































