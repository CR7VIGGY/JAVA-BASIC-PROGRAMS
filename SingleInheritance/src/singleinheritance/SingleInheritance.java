
package singleinheritance;
import java.util.Scanner;
class A
{
    int x,y;
    A(int a,int b)
    {
        x = a;
        y = b;
    }
    int  area()
    {
        int area= 0;
        return(x*y);
    }
}
class B extends A
{
    int height;
    B(int x,int y,int z)
    {
        super(x,y);
        height = z;
    }
    int volume()
    {
        int volume= 0 ;
        return (x*y*height);
    }
}
public class SingleInheritance 
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       int a,b,c;
       a = in.nextInt();
       b = in.nextInt();
       c = in.nextInt();
       B obj = new B(a,b,c);
       int area = obj.area();
       int vol = obj.volume();
       System.out.println("area"+area);
       System.out.println("volume"+vol);
    }
    
}
