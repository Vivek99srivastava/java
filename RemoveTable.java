import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class RemoveTable extends JApplet
        {
        JTable ta;
        public void init()
                {
                Container c=getContentPane();
                c.setLayout(new FlowLayout());
                String data[][]={{"Raju","0"},{"Tan","1"},{"Manas","2"},{"Sisir","3"}};
                String col[]={"Name","Position"};
                DefaultTableModel m1=new DefaultTableModel(data,col);
                ta=new JTable(m1);
                System.out.println("Before remove a row total rows are : "+m1.getRowCount());
                m1.removeRow(1);
                System.out.println("After remove a row total rows are : "+m1.getRowCount());
                c.add(ta);
                }
        }
/*<applet code="RemoveTable" width=400 height=400>
</applet>*/









