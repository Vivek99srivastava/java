import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileDemo1
	{
  	public static void main(String[] a) 
		{
    		JFrame frame = new JFrame("JFileChooser Popup");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		JFileChooser file = new JFileChooser(".");
    		file.setControlButtonsAreShown(false);
    		frame.add(file);
    		ActionListener action = new ActionListener() 
			{
      			public void actionPerformed(ActionEvent actionEvent) 
				{
        		JFileChooser the=(JFileChooser)actionEvent.getSource();
        		String command = actionEvent.getActionCommand();
        		if (command.equals(JFileChooser.APPROVE_SELECTION)) 
				{
          			File selectedFile = the.getSelectedFile();
          			System.out.println(selectedFile.getParent());
          			System.out.println(selectedFile.getName());
        		}else if(command.equals(JFileChooser.CANCEL_SELECTION)) 
				{
          			System.out.println(JFileChooser.CANCEL_SELECTION);
        			}
      				}
    			};
    		file.addActionListener(action);
    		frame.pack();
    		frame.setVisible(true);
  		}
	}
