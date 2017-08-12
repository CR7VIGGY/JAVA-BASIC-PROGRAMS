
package nestedclasses;
//only static class object can be created as static///
class Outer
{
    int x;
    Outer(int y)
    {
        x = y;
    }
    void test()
    {
        Inner in = new Inner();
        in.display();
    }
    class Inner
    {
        void display()
        {
            System.out.println(x);
        }
    }
}
public class NestedClasses
{

    public static void main(String[] args)
    {
       Outer out = new Outer(15);
       out.test();
       
    }
    
}
