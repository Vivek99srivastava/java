import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class ListDemo extends JPanel 
	{
  	JList list;
  	DefaultListModel model;
  	int counter = 15;
  	public ListDemo() 
		{
    		setLayout(new BorderLayout());
    		model = new DefaultListModel();
    		list = new JList(model);
    		JScrollPane pane = new JScrollPane(list);
    		JButton b1 = new JButton("Add Element");
    		JButton b2 = new JButton("Remove Element");
    		for (int i = 0; i < 15; i++)
      			model.addElement("Element " + i);
    		b1.addActionListener(new ActionListener() 
			{
      			public void actionPerformed(ActionEvent e) 
				{
        			model.addElement("Element " + counter);
        			counter++;
      				}
    			});
    		b2.addActionListener(new ActionListener() 
			{
      			public void actionPerformed(ActionEvent e) 
				{
        			if (model.getSize() > 0)
          				model.removeElementAt(0);
      				}
    			});

    		add(pane, BorderLayout.NORTH);
    		add(b1, BorderLayout.WEST);
    		add(b2, BorderLayout.EAST);
  		}

  	public static void main(String s[]) 
		{
    		JFrame frame = new JFrame("List Model Example");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setContentPane(new ListDemo());
    		frame.setSize(260, 200);
    		frame.setVisible(true);
  		}
	}
