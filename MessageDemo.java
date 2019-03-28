import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MessageDemo extends JFrame implements ActionListener
        {
        JButton b;

        public MessageDemo()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                b=new JButton("Click Messgae");
                b.setFont(new Font("Arial",Font.BOLD,22));
                b.addActionListener(this);
                c.add(b);
                setTitle("Message Box");
                c.setBackground(Color.pink) ;
                setSize(this.getPreferredSize());
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        public Dimension getPreferredSize()
                {
                return new Dimension(100,100);
                }
        public void actionPerformed(ActionEvent ae)
                {
                JOptionPane.showMessageDialog(this,"Hello See the message.","Message Box",JOptionPane.INFORMATION_MESSAGE);
                }
        public static void main(String args[])
                {
                MessageDemo md=new MessageDemo();
                }
        }



















