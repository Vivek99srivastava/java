import javax.swing.*;
import java.awt.*;
public class CreateTable extends JApplet
        {
        JTable ta;
        Font f;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                String col[]={"Name","Course","Grade"};
                String data[][]={{"Sai","MBA","A"},{"Raj","MCA","A"},{"Tan","MTech","A"}};
                ta=new JTable(data,col);
                ta.setFont(new Font("Arial",Font.BOLD,22));
                c.add(ta);
                }
        }
/*<applet code="CreateTable" width=350 height=350>
</applet>*/






