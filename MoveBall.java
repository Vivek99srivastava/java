import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class MoveBall extends Applet implements Runnable,ActionListener
{

TextField tf1,tf2;
Label l1,l2;
Button b1,b2,b3,b4;
 Thread t;
Font f;

public void init()
{

f=new Font("Arial",Font.BOLD,22);
tf1=new TextField(5);
tf2=new TextField(5);

l1=new Label("no of balls");
l2=new Label("speed");


b1=new Button("life");
b2=new Button("kill");
b3=new Button("pause");
b4=new Button("Reasum");

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

b4.addActionListener(this);

add(b1);
add(b2);
add(b3);
add(b4);
add(tf1);
add(tf2);add(l1);add(l2);
b1.setFont(f);
b2.setFont(f);
b3.setFont(f);
b4.setFont(f);
l1.setFont(f);
l2.setFont(f);
tf1.setFont(f);
tf2.setFont(f);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1&&t==null)
	{
	t=new Thread(this);
	t.start();
	}
else if(ae.getSource()==b2&&t!=null)
	{
	t.stop();
	t=null;
	}
else if(ae.getSource()==b3&&t!=null)
	{
	t.suspend();
	}
else if(ae.getSource()==b4&&t!=null)
	{
	t.resume();
	}
}
public void run()
{
while(true)
	{
	repaint();

	try{Thread.sleep(Long.parseLong(tf2.getText()));}

	catch(InterruptedException ie){}
	}
}

public void paint(Graphics g)

{
	for(int i=0;i<Integer.parseInt(tf1.getText());i++)
	{
	g.setColor(Color.red);
	g.fillOval(((int)(Math.random()*1000)%500),((int)(Math.random()*1000)%599),50,50);
}}
}



/*<applet code="MoveBall" width=599 height=599></applet>*/
