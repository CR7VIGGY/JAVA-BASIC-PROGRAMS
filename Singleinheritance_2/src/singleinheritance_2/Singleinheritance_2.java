//overriding methods
package singleinheritance_2;
import java.util.Scanner;
class A
{
    A()
    {
        x = 10;
    }
    public void finalize()
    {
        
    }
    int x;
    void display(int a)
    {
        x = a;
        System.out.println("You are in super class"+x);
    }
    
}
class B extends A
{
    int x,z;
    void display(int a,int b)
    {
        x = a;
        z = b;
        System.out.println("You are in subclass"+y+"\t"+z);
        
    }
}
public class Singleinheritance_2 
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        B obj = new B();
        obj.display(10);
        obj.display(100,200);
        
        
    }
    
}
