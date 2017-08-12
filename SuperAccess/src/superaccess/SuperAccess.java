
package superaccess;
import java.util.Scanner;
class A
{
    int x;
    A(int a)
    {
        x = a;
    } 
    void display()
    {
        System.out.println("super class x :"+ this.x);
    }
}
class B extends A
{
    int x;
    B(int x,int y)
    {
        super(y);
        this.x = x;
        //super.x = y; 
          // directly callng the contrctr of superclass by super(....) keyword
    }
    void display()
    {
        super.display();
        System.out.println("sub class x :"+this.x);
    }
}
public class SuperAccess
{

    public static void main(String[] args)
    {
        B b = new B(15,20);
        b.display();
    }
    
}
