import java.awt.*;
import java.awt.event.*;		//import packages
import java.applet.*;
/*
<applet code="CalaulatorDemo" width=500 height=150></applet>
*/
public class CalaulatorDemo extends Applet implements ActionListener	{
	String msg="";
	TextField input1,input2;
	Button addi,sub,mul,div;
	public void init()	{
		Label input1p=new Label("1st Number : ",Label.RIGHT);
		Label input2p=new Label("2nd Number : ",Label.RIGHT);
		input1=new TextField(15);
		input2=new TextField(15);
		addi=new Button("Addition");
		sub=new Button("Subtraction");
		mul=new Button("Multiplication");
		div=new Button("Division");
		add(input1p);add(input1);add(input2p);add(input2);
		add(addi);add(sub);add(mul);add(div);
		input1.addActionListener(this);input2.addActionListener(this);addi.addActionListener(this);
		sub.addActionListener(this);mul.addActionListener(this);div.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)	{
		String str= ae.getActionCommand();
		int a;
		float b;
		if(str.equals("Addition"))	{
			a=Integer.parseInt(input1.getText())+Integer.parseInt(input2.getText());
			msg=""+a;
		}
		else if(str.equals("Subtraction"))	{
			a=Integer.parseInt(input1.getText())-Integer.parseInt(input2.getText());
			msg=""+a;
		}
		else if(str.equals("Multiplication")){
			a=Integer.parseInt(input1.getText())*Integer.parseInt(input2.getText());
			msg=""+a;
		}
		else	{
			b=Float.parseFloat(input1.getText())/Float.parseFloat(input2.getText());
			msg=""+b;
		}
		repaint();
	}
	public void paint(Graphics g)	{
		int x,y;
		x=Integer.parseInt(input1.getText());
		y=Integer.parseInt(input2.getText());
		g.drawString("Result : "+msg,6,100);
	}
}
