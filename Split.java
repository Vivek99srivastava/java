import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
public class Split extends JFrame implements ActionListener
        {
        JButton b;
        JTextArea ta;
        JSplitPane sp;
        String str="I Like Java Language . This is Interface Software";
        Font f;
        Split()
                {
                Container c=this.getContentPane();
                c.setLayout(new BorderLayout());
                b=new JButton("Click");
                f=new Font("Arial",Font.BOLD,20);
                b.setFont(f);
                b.addActionListener(this);
                ta=new JTextArea(10,20);
                ta.setFont(f);
                sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,b,ta);
                sp.setDividerLocation(300);
                c.add(sp);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setSize(600,600);
                this.setTitle("Split Pane Example");
                this.setVisible(true);
                }
        public void actionPerformed(ActionEvent ae)
                {
                ta.setText(str);
                }
        public static void main(String args[])
                {
                Split ss=new Split();
                }
        }
















