import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuDemo extends JFrame 
	{
    	JMenuBar bar = new JMenuBar();
    	JMenu m1 = new JMenu("File");
    	JMenu m2 = new JMenu("Edit");
    	JMenuItem item1 = new JMenuItem("Save");
    	JMenuItem item2 = new JMenuItem("Open");

    	public MenuDemo() 
		{
        	setJMenuBar(bar);
		setTitle("Menu Demo");
        	setVisible(true);
        	setSize(400, 200);
        	bar.add(m1);
        	bar.add(m2);
        	m1.add(item1);
        	m1.add(item2);
        	item1.addActionListener(new ActionListener() 
			{
            		public void actionPerformed(ActionEvent e) 
				{
                		JFileChooser chooser = new JFileChooser();
                			chooser.showSaveDialog(null);
            			}
        		});
        	item2.addActionListener(new ActionListener() 
			{
            		public void actionPerformed(ActionEvent e) 
				{
                		JFileChooser chooser = new JFileChooser();
                			chooser.showOpenDialog(null);
            			}
        		});
		}
	public static void main(String[] args) 
		{
        	MenuDemo md = new MenuDemo();
    		}
	}