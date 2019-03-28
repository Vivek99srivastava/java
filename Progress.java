import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Progress extends JFrame implements ActionListener
        {
        JButton button;
        Runnable rr;
        public Progress()
                {
                setTitle("See ProgressBar");
                Container c=getContentPane();
                c.setLayout(new BorderLayout());
                button=new JButton("Start");
                button.setFont(new Font("Arial",Font.BOLD,22));
                button.addActionListener(this);
                c.add(button);
                int min=0;
                int max=100;
                String str[]=new String[2];
                str[0]="Performing Operation";
                str[1]="This may take some time...";
                final ProgressMonitor monitor=new ProgressMonitor(this,str,"Iteration",min,max);
                rr=new Runnable()
                        {
                        public void run()
                                {
                                for(int i=1;i<=100;i++)
                                        {
                                        try{
                                        monitor.setNote("Iteration : "+i);
                                        monitor.setProgress(i);
                                        if(monitor.isCanceled())
                                                {
                                                monitor.setProgress(100);
                                                break;
                                                }
                                        Thread.sleep(500);
                                        }catch(InterruptedException ie)
                                                {
                                                }
                                        }
                                }
                        //monitor.close();
                        };
                setSize(500,500);
                setVisible(true);
                }
        public void actionPerformed(ActionEvent ae)
                {
                Thread t=new Thread(rr);
                t.start();
                }
        public static void main(String args[])
                {
                Progress p=new Progress();
                }
        }




























