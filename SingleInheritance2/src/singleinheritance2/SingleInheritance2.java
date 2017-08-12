
package singleinheritance2;
import java.util.Scanner;
class A
{
    int x;
    void test()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no.");
        x = in.nextInt();
    }
    int Square()
    {
        return(x*x);
    }
}
class B extends A
{
    int y;
    int test1()
    {
        y = Square()*x;
        return y;
    }
}
public class SingleInheritance2 
{

    public static void main(String[] args)
    {
       B b  = new B();
       b.test();
       int z = b.test1();
       System.out.println(z);
    }
    
}
