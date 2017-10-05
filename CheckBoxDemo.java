import java.awt.*;
import java.awt.event.*;		//import packages
import java.applet.*;
/*
<applet code="CheckBoxDemo" width=250 height=150></applet>
*/
public class CheckBoxDemo extends Applet implements ItemListener	{
	String msg="";
	Checkbox win10,winNT,solaris,Mac;
	CheckboxGroup cbg;
	public void init()	{
		cbg=new CheckboxGroup();
		win10=new Checkbox("Windows 10",cbg,true);
		winNT=new Checkbox("Windows NT",cbg,false);
		solaris=new Checkbox("Solaris",cbg,false);
		Mac=new Checkbox("MacOS",cbg,false);
		add(win10);
		add(winNT);
		add(solaris);
		add(Mac);
		win10.addItemListener(this);
		winNT.addItemListener(this);
		solaris.addItemListener(this);
		Mac.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)	{
		repaint();
	}
	public void paint(Graphics g)	{
		/*msg="Current state: ";
		g.drawString(msg,6,80);
		msg="Windows 10: "+win10.getState();
		g.drawString(msg,6,100);
		msg="Windows NT: "+winNT.getState();
		g.drawString(msg,6,120);
		msg="Sloaris: "+solaris.getState();
		g.drawString(msg,6,140);
		msg="MacOS: "+Mac.getState();
		g.drawString(msg,6,160);*/
		msg="Current state: ";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,100);
	}
}
