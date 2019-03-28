import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
public class TreeDemo 
	{
  	public static void main(String[] a) 
		{
    		JFrame f = new JFrame();
		f.setTitle("JTree Example");
    		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		f.add(new Demo());
    		f.setSize(500, 500);
    		f.setVisible(true);
  		}
	}

class Demo extends JPanel 
	{
  	JTree tree;
  	JTextField jtf;
  	public Demo() 
		{
    		setLayout(new BorderLayout());
    		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
    		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Course");
    		top.add(a);
        	a.add(new DefaultMutableTreeNode("Java"));
    		a.add(new DefaultMutableTreeNode("Oracle"));

    		DefaultMutableTreeNode b = new DefaultMutableTreeNode("Institute");
    		top.add(b);
        	b.add(new DefaultMutableTreeNode("Interface"));
    		b.add(new DefaultMutableTreeNode("SSi Limited"));
    		b.add(new DefaultMutableTreeNode("Aptech"));

    		tree = new JTree(top);
    		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    		JScrollPane jsp = new JScrollPane(tree, v, h);
    		add(jsp);
    		jtf = new JTextField(20);
    		add(jtf,BorderLayout.SOUTH);
    		tree.addMouseListener(new MouseAdapter() 
			{
      			public void mouseClicked(MouseEvent me) 
				{
        			doMouseClicked(me);
      				}
    			});
  		}

  	void doMouseClicked(MouseEvent me) 
		{
    		TreePath tp=tree.getPathForLocation(me.getX(), me.getY());
    		if (tp != null)
      			jtf.setText(tp.toString());
    		else
      			jtf.setText("");
  		}
	}
	
