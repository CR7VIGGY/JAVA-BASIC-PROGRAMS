//classname.methodname whenever used it says it is static//
package staticmember;
import java.util.Scanner;
class MyWork
{
    static int x = 10;
    static int count = 1;
    static int flag = 2;
    static void display()
    {
        System.out.println("static member initialized : ");
    }
    static void increment()
    {
        System.out.println("increment function called :"+count);
        count++;
    }
    void call() //nonstatic member function can call static variabes but static member function cannot call nonstatic variables
    {
        System.out.println("static can call nonstatic variables or member :"+flag);
    }
}
public class StaticMember
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        MyWork.display();
        System.out.println("value of x :"+MyWork.x);
        MyWork.increment();
        MyWork.increment();
        MyWork m = new MyWork();
        m.increment();
        m.call();
        
    }
    
}
