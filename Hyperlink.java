import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class Hyperlink extends JFrame
{
    public static void main(String arg[])throws Exception
    {
        new Hyperlink();
    }
    public Hyperlink() throws Exception
    {
        String s = "http://www.rashmikantadas.com";
        JEditorPane pane = new JEditorPane(s);
        pane.setEditable(false);
        final JEditorPane finalpane = pane;
        pane.addHyperlinkListener(new HyperlinkListener()
        {
            public void hyperlinkUpdate(HyperlinkEvent r)
            {
                try
                {
             if(r.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
             finalpane.setPage(r.getURL());
                }catch(Exception e)
                {}
            }
        });

         setContentPane(new JScrollPane(pane));
         setSize(400,400);
         setVisible(true);
    }
}