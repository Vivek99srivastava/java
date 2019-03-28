import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class JRadioButtonDemo 
	{
  	public static void main(String args[]) 
		{
    		JFrame frame = new JFrame("Radio Button Example");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		JPanel panel = new JPanel(new GridLayout(0, 1));
    		ButtonGroup group = new ButtonGroup();
    		JRadioButton rb1 = new JRadioButton("Java");
    		JRadioButton rb2 = new JRadioButton("Oracle");
    		ItemListener itemListener = new ItemListener() 
			{
      			String lastSelected;
      			public void itemStateChanged(ItemEvent itemEvent) 
				{
        		AbstractButton ab = (AbstractButton)itemEvent.getSource();
        			int state = itemEvent.getStateChange();
        			String label = ab.getText();
        			String msgStart;
        			if (state == ItemEvent.SELECTED) 
					{
          				if (label.equals(lastSelected)) 
						{
            					msgStart = "Reselected -> ";
          					}  else {
           					msgStart = "Selected -> ";
          					}
          				lastSelected = label;
        				}  else {
          				msgStart = "Deselected -> ";
        				}
        			System.out.println(msgStart + label);
      				}
    			};

    		panel.add(rb1);
    		group.add(rb1);
    		panel.add(rb2);
    		group.add(rb2);
		rb1.addItemListener(itemListener);
    		rb2.addItemListener(itemListener);
    		frame.add(panel);
    		frame.setSize(300, 200);
    		frame.setVisible(true);
  		}
 	}