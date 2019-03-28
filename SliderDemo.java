import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame 
	{
  	JSlider s1 = new JSlider();
  	JSlider s2 = new JSlider(JSlider.HORIZONTAL, -100, 100, 0);

  	public SliderDemo() 
		{
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		getContentPane().setLayout(new GridLayout(2, 1));

    		s1.addChangeListener(new ChangeListener() 
			{
      			public void stateChanged(ChangeEvent e) 
				{
       			System.out.println("Slider1: " + s1.getValue());
      				}
    			});
    		getContentPane().add(s1);

    		s2.setPaintTicks(true);
    		s2.setMajorTickSpacing(50);
    		s2.setMinorTickSpacing(10);
    		s2.setPaintLabels(true);
    		Hashtable ht = s2.createStandardLabels(50);
    		s2.setLabelTable(ht);

    		s2.addChangeListener(new ChangeListener() 
			{
      			public void stateChanged(ChangeEvent e) 
				{
        		System.out.println("Slider2: "+s2.getValue());
      				}
    			});
    		getContentPane().add(s2);
    		pack();
  		}

  	public static void main(String[] args) 
		{
    		new SliderDemo().setVisible(true);
  		}
	}
