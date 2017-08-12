
package inheritance;
import java.util.Scanner;
class A
{
    int i;
    void show()
    {
        System.out.println("class A i : "+i);
    }
}
class B extends A
{
    int j,k;
    void show()
    {
        System.out.println("class B sum :"+(i+j+k));
    }
}
public class Inheritance 
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       B b = new B();
       A a = new A();
       a.i = 10;
       a.show();
       b.i = a.i;
       b.j = 15;
       b.k = 20;
       b.show();
       
       
    }
    
}
