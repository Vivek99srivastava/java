import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class pcrash extends Applet implements Runnable,ActionListener
	{
		Thread t;
		Button b1,b2,b3,b4;
		        int l;
			int a=0,b=0;
			TextField tf1;
			Label l1;
			public void init()
      			   {
				l1=new Label("Enter Speed in ms");
				l1.setForeground(Color.orange);
				tf1=new TextField(5);
				b1=new Button("start");
				b2=new Button("stop");
				b3=new Button("pause");
				b4=new Button("Resume");
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				setBackground(Color.black);
				add(l1);
				add(tf1);
				add(b1);
				add(b2);
				add(b3);
				add(b4);
			}
		 public void actionPerformed(ActionEvent ae)
			{
		    if((ae.getSource()==b1)&&(t==null))
		     	{
				t=new Thread(this);
				t.start();
		    	 }
		    else if((ae.getSource()==b2)&&(t!=null))
			{
				t.stop();
				t=null;
			}
		    else if((ae.getSource()==b3)&&(t!=null))
			{
				t.suspend();
			}
		      else if((ae.getSource()==b4)&&(t!=null))
			{
				t.resume();
			}
	     }
	     public void run()
		{
			for(a=0;a<650;a++)
			        {
					repaint();
					try
					   {
				repaint();
				Thread.sleep(Integer.parseInt(tf1.getText()));
			}
			catch(Exception e)
			{
                        }
		}
	}
	public void paint(Graphics g)
		{
			if(a>475)
			   {
				try
				   {
					getAudioClip(new URL(getCodeBase(),"bonk.au")).play();
				    }
    				catch (Exception e) 
                                      {
                                       }
			 }
			if(a>600)
			    {
				g.setColor(Color.lightGray);
				g.fillRect(650,390,130,750);
		int x[]={650,660,695,680,740,720,734,756,794,830,860,780};
		int y[]={390,370,340,290,259,398,350,400,245,290,420,380};
		g.fillPolygon(x,y,11);
		for(int i=0;i<750;i++)
		     {
			  g.drawLine(780,380+i,860,420+i);
		     }
		g.setColor(Color.black);
		for(int i=0;i<5;i++)
			g.drawRect(650+i,100+i,130-2*i,760-2*i);
			g.fillRect(856,150,5,750);
		for(int i=0;i<5;i++)
			g.drawLine(780,100+i,860,150+i);
		for(int k=0;k<750;k+=15)
		     {
			g.fillRect(650,100+k,130,3);
			for(int i=0;i<3;i++)
			g.drawLine(780,100+i+k,860,150+i+k);
		     }
	    }
           else
	            {
	                g.setColor(Color.gray);
	   	        g.fillRoundRect(50+a,198+b,150,30,130,25);
	    for(int i=0;i<20;i++)
	       {
		     g.drawLine(50+a+i,218+b,40+a+i/2,190+b);
	       }
	    for(int i=0;i<80;i++)
	      {
		if(i>39)
		      g.drawLine(90+a+i,175+b+i,115+a+i-(i%40)/2+7,175+b+i);
	        else
	              g.drawLine(90+a+i,175+b+i,115+a+i+(i%40)/2-5,175+b+i);
	        }
	    g.fillOval(112+a,180+b,20,10);
	    g.fillOval(163+a,236+b,20,10);
     	    g.setColor(Color.lightGray);
	    g.fillRect(650,100,130,750);
	    for(int i=0;i<750;i++)
		  {
			g.drawLine(780,100+i,860,150+i);
		   }
	    g.setColor(Color.darkGray);
	    for(int i=0;i<5;i++)
		             g.drawRect(650+i,100+i,130-2*i,760-2*i);
	  		     g.fillRect(856,150,5,750);
	    for(int i=0;i<5;i++)
			     g.drawLine(780,100+i,860,150+i);
	    for(int k=0;k<750;k+=15)
		{
		      	     g.fillRect(650,100+k,130,3);
		 	 for(int i=0;i<3;i++)
					g.drawLine(780,100+i+k,860,150+i+k);
			      }
			}
		}
	}


/*<applet code="pcrash" width=900 height=650>
</applet>*/
