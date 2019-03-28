Multithreading :
1)	What is multithreading?
- Multithreading means to perform multitasking. Every task here have a thread each task execute its thread. To perform multiple task at same time is known as multithreading. If in a process multi thread execute at same time will be called multithread execution.
 We use thread because thread is light weight, it share same memory space.
 They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

We can achieve multi tasking in two ways:
- By using process based or  by using thread based.
-process based is multiprocessing.
-thread based is multitasking. 
2) Why multithreading?
- We use multithreading to execute multiple task at same time. For example – Your mobile , when we use mobile now a days we can perform multiple task at same time. Listening music, viewing images, running facebook, in all way every program is keep running at back without stoping other task.
3) Real time example of multithreading:
- Mobile or operating system.
4) How to make multithread programs?
- we can make multithread program in two ways:
- By extends a current class with Thread class.
-By implementing Runnable interface.
Using Runnable interface is always suggestable because when we use Thread class by extending it in our class than we cannot have extend other class because java doesn’t support multilevel inheritance.  To avoid this issue we have inheritance where we use interface . Interface support multiple inheritance. It means when we inherit Runnable interface and other interface and we can extend a class also. This gives us better flexibility.
5) Thread life cycle.-
There are four states of thread application.
-new -  
-runnanle
-running
-non – runnable
- Terminated
Start()
The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
Run()
The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
wait(),sleep()
This is the state when the thread is still alive, but is currently not eligible to run.
•	New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
•	Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
•	Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
•	Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
•	Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.

-
6) Examples of multithreading.
  example-1
1.	class Multi extends Thread{  
2.	public void run(){  
3.	System.out.println("thread is running...");  
4.	}  
5.	public static void main(String args[]){  
6.	Multi t1=new Multi();  
7.	t1.start();  
8.	 }  
9.	} 


Example-2:
1.	class TestSleepMethod1 extends Thread{  
2.	 public void run(){  
3.	  for(int i=1;i<5;i++){  
4.	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
5.	    System.out.println(i);  
6.	  }  
7.	 }  
8.	 public static void main(String args[]){  
9.	  TestSleepMethod1 t1=new TestSleepMethod1();  
10.	  TestSleepMethod1 t2=new TestSleepMethod1();  
11.	   
12.	  t1.start();  
13.	  t2.start();  
14.	 }  
15.	} 


Example-3
1.	class TestJoinMethod2 extends Thread{  
2.	 public void run(){  
3.	  for(int i=1;i<=5;i++){  
4.	   try{  
5.	    Thread.sleep(500);  
6.	   }catch(Exception e){System.out.println(e);}  
7.	  System.out.println(i);  
8.	  }  
9.	 }  
10.	public static void main(String args[]){  
11.	 TestJoinMethod2 t1=new TestJoinMethod2();  
12.	 TestJoinMethod2 t2=new TestJoinMethod2();  
13.	 TestJoinMethod2 t3=new TestJoinMethod2();  
14.	 t1.start();  
15.	 try{  
16.	  t1.join(1500);  
17.	 }catch(Exception e){System.out.println(e);}  
18.	  
19.	 t2.start();  
20.	 t3.start();  
21.	 }  
22.	}  


Show programs of runtime. Cmd, shutdown, etc..

Applet:
1)	What is Applet?
- Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client side.

2)	Why we use applet?
o	 It works at client side so less response time.
o	Secured
o	It can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc

3)	Applet life cycle.
 Four methods in the Applet class gives you the framework on which you build any serious applet −
•	init − This method is intended for whatever initialization is needed for your applet. It is called after the param tags inside the applet tag have been processed.
•	start − This method is automatically called after the browser calls the init method. It is also called whenever the user returns to the page containing the applet after having gone off to other pages.
•	stop − This method is automatically called when the user moves off the page on which the applet sits. It can, therefore, be called repeatedly in the same applet.
•	destroy − This method is only called when the browser shuts down normally. Because applets are meant to live on an HTML page, you should not normally leave resources behind after a user leaves the page that contains the applet.
•	paint − Invoked immediately after the start() method, and also any time the applet needs to repaint itself in the browser. The paint() method is actually inherited from the java.awt.
-	
4)	How to make applet program?
-	 Example -1.
import java.applet.Applet;  
import java.awt.*;  
  
public class GraphicsDemo extends Applet{  
  
public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("Welcome",50, 50);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
  
}  
} 

Example-2.

import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
   }
}

Example -3
 Moving pic
1.	import java.awt.*;  
2.	import java.applet.*;  
3.	public class AnimationExample extends Applet {  
4.	  
5.	  Image picture;  
6.	  
7.	  public void init() {  
8.	    picture =getImage(getDocumentBase(),"bike_1.gif");  
9.	  }  
10.	    
11.	  public void paint(Graphics g) {  
12.	    for(int i=0;i<500;i++){  
13.	      g.drawImage(picture, i,30, this);  
14.	  
15.	      try{Thread.sleep(100);}catch(Exception e){}  
16.	    }  
17.	  }  
18.	}

Example -4(Textfield and buttons)

1.	import java.applet.*;  
2.	import java.awt.*;  
3.	import java.awt.event.*;  
4.	public class EventApplet extends Applet implements ActionListener{  
5.	Button b;  
6.	TextField tf;  
7.	  
8.	public void init(){  
9.	tf=new TextField();  
10.	tf.setBounds(30,40,150,20);  
11.	  
12.	b=new Button("Click");  
13.	b.setBounds(80,150,60,50);  
14.	  
15.	add(b);add(tf);  
16.	b.addActionListener(this);  
17.	  
18.	setLayout(null);  
19.	}  
20.	  
21.	 public void actionPerformed(ActionEvent e){  
22.	  tf.setText("Welcome");  
23.	 }   
24.	} 

Example -5 (Playing audio)
import java.applet.*;
import java.awt.*;
import java.net.*;

public class AudioDemo extends Applet {
   private AudioClip clip;
   private AppletContext context;
   
   public void init() {
      context = this.getAppletContext();
      String audioURL = this.getParameter("audio");
      if(audioURL == null) {
         audioURL = "default.au";
      }
      try {
         URL url = new URL(this.getDocumentBase(), audioURL);
         clip = context.getAudioClip(url);
      } catch (MalformedURLException e) {
         e.printStackTrace();
         context.showStatus("Could not load audio file!");
      }
   }
   
   public void start() {
      if(clip != null) {
         clip.loop();
      }
   }
   
   public void stop() {
      if(clip != null) {
         clip.stop();
      }
   }
}



5)	Demo application on applet.
-	From folder applet programs.
6)	Disadvantage of applet.
o	 Plugin is required at client browser to execute applet.
-	
Swing:
1)	What is Swing?
-	 Java Swing is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
-	The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.
No.	Java AWT	Java Swing
1)	AWT components are platform-dependent.	Java swing components are platform-independent.
2)	AWT components are heavyweight.	Swing components are lightweight.
3)	AWT doesn't support pluggable look and feel.	Swing supports pluggable look and feel.
4)	AWT provides less components than Swing.	Swing provides more powerful componentssuch as tables, lists, scrollpanes, colorchooser, tabbedpane etc.
5)	AWT doesn't follows MVC(Model View Controller) where model represents data, view represents presentation and controller acts as an interface between model and view.	Swing follows MVC.


2)	Why we use Swing?
-	From above difference 
o	Light Weight − Swing components are independent of native Operating System's API as Swing API controls are rendered mostly using pure JAVA code instead of underlying operating system calls.
o	Rich Controls − Swing provides a rich set of advanced controls like Tree, TabbedPane, slider, colorpicker, and table controls.
o	Highly Customizable − Swing controls can be customized in a very easy way as visual apperance is independent of internal representation.
o	Pluggable look-and-feel − SWING based GUI Application look and feel can be changed at run-time, based on available values.
-	
3)	How to make Swing application?

Example-1:
4)	import javax.swing.*;    
5)	public class ButtonExample {  
6)	public static void main(String[] args) {  
7)	    JFrame f=new JFrame("Button Example");  
8)	    JButton b=new JButton("Click Here");  
9)	    b.setBounds(50,100,95,30);  
10)	    f.add(b);  
11)	    f.setSize(400,400);  
12)	    f.setLayout(null);  
13)	    f.setVisible(true);   
14)	}  
15)	}  

Example-2
1.	import javax.swing.*;  
2.	class TextFieldExample  
3.	{  
4.	public static void main(String args[])  
5.	    {  
6.	    JFrame f= new JFrame("TextField Example");  
7.	    JTextField t1,t2;  
8.	    t1=new JTextField("Welcome to Javatpoint.");  
9.	    t1.setBounds(50,100, 200,30);  
10.	    t2=new JTextField("AWT Tutorial");  
11.	    t2.setBounds(50,150, 200,30);  
12.	    f.add(t1); f.add(t2);  
13.	    f.setSize(400,400);  
14.	    f.setLayout(null);  
15.	    f.setVisible(true);  
16.	    }  
17.	    }

Example -3

1.	import javax.swing.*;    
2.	public class TableExample {    
3.	    JFrame f;    
4.	    TableExample(){    
5.	    f=new JFrame();    
6.	    String data[][]={ {"101","Amit","670000"},    
7.	                          {"102","Jai","780000"},    
8.	                          {"101","Sachin","700000"}};    
9.	    String column[]={"ID","NAME","SALARY"};         
10.	    JTable jt=new JTable(data,column);    
11.	    jt.setBounds(30,40,200,300);          
12.	    JScrollPane sp=new JScrollPane(jt);    
13.	    f.add(sp);          
14.	    f.setSize(300,400);    
15.	    f.setVisible(true);    
16.	}     
17.	public static void main(String[] args) {    
18.	    new TableExample();    
19.	}    
20.	}  


16)	Example of Swing program.
End of the session:
1)	Real time programs on java- multithreading, applet, swing.


