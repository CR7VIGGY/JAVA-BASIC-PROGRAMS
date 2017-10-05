import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="inout" width=300 height=300> </applet>
*/

public class inout extends Applet
{
		TextField t1, t2;
		public void init()
        {
                t1 = new TextField(10);
                t2 = new TextField(10);

                add(t1);
                add(t2);

                t1.setText("0");
                t2.setText("0");
        }
        public void paint(Graphics g)
        {
                int a=0,b=0,c=0;
                String str1,str2,str;

                g.drawString("Enter the number in each box",10,50);

                try
                {
                        str1=t1.getText();
                        a=Integer.parseInt(str1);

                        str2=t2.getText();
                        b=Integer.parseInt(str2);
                }
                catch(Exception e)
                {
                }
                
        }
}
