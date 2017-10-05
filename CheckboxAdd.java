import java.awt.*;
import java.awt.event.*;		//import packages
import java.applet.*;
/*
<applet code="CheckboxAdd" width=200 height=150></applet>
*/
public class CheckboxAdd extends Applet implements ItemListener	{
	String msg="";
	Checkbox one,two,three,four,five;
	Checkbox six,seven,eight,nine,ten;
	CheckboxGroup cbg1,cbg2;
	public void init()	{
		cbg1=new CheckboxGroup();
		one=new Checkbox("1",cbg1,false);
		two=new Checkbox("2",cbg1,false);
		three=new Checkbox("3",cbg1,false);
		four=new Checkbox("4",cbg1,false);
		five=new Checkbox("5",cbg1,false);
		cbg2=new CheckboxGroup();
		six=new Checkbox("6",cbg2,false);
		seven=new Checkbox("7",cbg2,false);
		eight=new Checkbox("8",cbg2,false);
		nine=new Checkbox("9",cbg2,false);
		ten=new Checkbox("10",cbg2,false);
		add(one);add(two);add(three);add(four);add(five);add(six);add(seven);add(eight);add(nine);add(ten);
		one.addItemListener(this);two.addItemListener(this);three.addItemListener(this);four.addItemListener(this);
		five.addItemListener(this);six.addItemListener(this);seven.addItemListener(this);eight.addItemListener(this);
		nine.addItemListener(this);ten.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)	{
		repaint();
	}
	public void paint(Graphics g)	{
		msg="Addition : ";
		int x,y,z;
		x=Integer.parseInt(cbg1.getSelectedCheckbox().getLabel());
		y=Integer.parseInt(cbg2.getSelectedCheckbox().getLabel());
		z=x+y;
		g.drawString(msg+z,2,80);
	}
}
