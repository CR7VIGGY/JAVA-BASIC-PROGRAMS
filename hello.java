import java.awt.*;
import java.applet.*;

/*
<applet code="hello" width=1080 height=720> <PARAM NAME = "string" VALUE = "Applet! "></applet>
*/

public class hello extends Applet
{
  String str;
  public void init()
  {
    str = getParameter("string");
    if(str == null)
    {
      str = "java";
      str = "hello" + str;
    }
  }
  public void paint(Graphics g)
  {
    g.drawString("hello java Applet",20,100);
    g.drawString(str , 500, 100);
  }
}
