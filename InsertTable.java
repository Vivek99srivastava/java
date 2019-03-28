import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class InsertTable extends JApplet
        {
        JTable ta;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                String data[][]={{"Vicky","45"},{"Litu","44"},{"Raj","38"}};
                String col[]={"Name","Code"};
                DefaultTableModel m1=new DefaultTableModel(data,col);
                ta=new JTable(m1);
                ta.setFont(new Font("Arial",Font.BOLD,22));
                m1.insertRow(0,new Object[]{"Lucy","42"});
                m1.insertRow(1,new Object[]{"Leena","41"});
                c.add(ta);
                }
       }
/*<applet code="InsertTable" width=400 height=400>
</applet>*/






