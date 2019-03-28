import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CenterJDialog extends JFrame
	{
	JButton jb;
	JDialog jd;
	JFrame thisFrame;
	public CenterJDialog()
		{
		setTitle("Center a JDialog");
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		thisFrame=this;
		jb=new JButton("Click me to open JDialog :)");
		add(jb);
		jb.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
			{
			jd=new JDialog(thisFrame);
			jd.setTitle("I am a JDialog");
			jd.setLayout(new FlowLayout());
			jd.add(new JTextField(20));
			jd.add(new JButton("Button"));
			jd.setVisible(true);
			jd.pack();
			jd.setLocationRelativeTo(thisFrame);
			}
		});

	}
	public static void main(String args[])
		{
		new CenterJDialog();
		}
	}