import java.awt.*;
import java.applet.Applet;

public class LOGIN extends Applet
{
BorderLayout b1;
Label l1,l2,l;
Button b;
TextField tf1,tf2;
Panel p,p1,p2,p3,p4;



public void init()
{
b1=new BorderLayout();
setLayout(b1);
l=new Label("LOG IN");

Font ff=new Font("Arial",Font.BOLD,22);
l.setFont(ff);

p1=new Panel();
p1.add(l);
add(p1,BorderLayout.NORTH);
p2=new Panel();
 b=new Button("submit");
p2.add(b);
Font f=new Font("Arial",Font.BOLD,22);
b.setFont(f);
add(p2,BorderLayout.SOUTH);


p=new Panel();

GridLayout g1=new GridLayout(2,1);
p.setLayout(g1);
add(p);

p3=new Panel();
l1=new Label("user id");
l1.setFont(f);

tf1=new TextField(12);
tf1.setFont(f);
p3.add(tf1);
p3.add(l1);

p.add(p3);

p4=new Panel();
l2=new Label("password");
l2.setFont(f);
tf2=new TextField(12);
tf2.setFont(f);
tf2.setEchoChar('$');
p4.add(l2);
p4.add(tf2);
p.add(p4);
add(p);
}
}
/*<applet code="LOGIN" width=400 height=400></applet>*/
