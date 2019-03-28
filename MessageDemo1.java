import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MessageDemo1 extends JFrame implements ActionListener
        {
        JButton b;
        
        public MessageDemo1()
                {
                JFrame frame=new JFrame("Dialog Box");
                frame.setLayout(new FlowLayout());
                b=new JButton("Click It");
                b.setFont(new Font("Arial",Font.BOLD,22));
                b.addActionListener(this);
                frame.add(b);
                frame.setSize(this.getPreferredSize());
                frame.setVisible(true);
                
                }
        public Dimension getPreferredSize()
                {
                return new Dimension(100,100);
                }
        public void actionPerformed(ActionEvent ae)
                {
                int result=JOptionPane.showConfirmDialog(this,"Continue");
                switch(result)
                        {
                        case JOptionPane.YES_OPTION:
                        System.out.println("Yes Button is pressed.");
                        break;

                        case JOptionPane.NO_OPTION:
                        System.out.println("No Button is pressed.");
                        break;

                        case JOptionPane.CANCEL_OPTION:
                        System.out.println("Cancel Button is pressed.");
                        break;

                        case JOptionPane.CLOSED_OPTION:
                        System.out.println("Dialog is closed.");
                        break;
                        }
                }
        public static void main(String args[])
                {
                new MessageDemo1();
                }
        }




































