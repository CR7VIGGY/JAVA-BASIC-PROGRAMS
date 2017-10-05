import java.awt.*;
import java.awt.event.*;		//import packages
import java.applet.*;
/*
<applet code="ButtonDemo" width=250 height=150></applet>
*/
public class ButtonDemo extends Applet implements ActionListener	{
	String msg="";
	Button yes,no,maybe;
	public void init()	{
		yes=new Button("Yes");
		no=new Button("No");
		maybe=new Button("Undefined");
		add(yes);
		add(no);
		add(maybe);
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)	{
		String str= ae.getActionCommand();
		if(str.equals("Yes"))	{
			msg="You pressed yes";
		}
		else if(str.equals("No"))	{
			msg="You pressed no";
		}
		else	{
			msg="You pressed undefined";
		}
		repaint();
	}
	public void paint(Graphics g)	{
		g.drawString(msg,10,100);
		showStatus(msg);
 g.drawString("hello java",40,100);	}
}
