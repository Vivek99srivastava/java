import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class PopupActionListener implements ActionListener {
  public void actionPerformed(ActionEvent actionEvent) {
    System.out.println("Selected: " + actionEvent.getActionCommand());
  }
}

public class PopupMenuDemo 
	{
  	public static void main(final String args[]) 
		{
    		JFrame frame = new JFrame("PopupMenu Example");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create popup menu, attach popup menu listener
    		JPopupMenu pop = new JPopupMenu("Title");
    		ActionListener action = new PopupActionListener();

    // Cut
    		JMenuItem cut = new JMenuItem("Cut");
    		pop.add(cut);

    // Copy
    		JMenuItem copy = new JMenuItem("Copy");
    		copy.addActionListener(action);
    		pop.add(copy);
    // Paste
    		JMenuItem paste = new JMenuItem("Paste");
    		paste.addActionListener(action);
    		paste.setEnabled(false);
    		pop.add(paste);

    // Separator
    		pop.addSeparator();

    // Find
    		JMenuItem find = new JMenuItem("Find");
    		find.addActionListener(action);
    		pop.add(find);
    		JButton b1 = new JButton();
    		frame.add(b1);
    		b1.setComponentPopupMenu(pop);

    		frame.setSize(350, 250);
    		frame.setVisible(true);
  		}
	}