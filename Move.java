import java.awt.*;
import java.applet.Applet;
public class Move extends Applet implements Runnable
{

Thread t;
int x;

public void init()
{
setBackground(Color.red);
}

public void start()
{
t=new Thread(this);
t.start();
}

public void stop()
{
t.stop();
t=null;
}

public void paint(Graphics g)
{
g.setColor(Color.green);
g.fillOval(x,100,50,50);
}

public void run()
{
while(true)

	{
		for(;x<getSize().width;x+=10)

		{/*if(x<getSize().width)x++;else x=0;*/
			repaint();
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
			}
		}
	}
}


}
/*<applet code="Move" width=500 height=400></applet>*/