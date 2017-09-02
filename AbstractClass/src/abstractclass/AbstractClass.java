//those classes whose objects can't be created 
package abstractclass;

abstract class Math
{
    int x,y,z;
    abstract void cal();//pure virtual class
    void add(int o,int p)
    {
        z = x+y;
        System.out.println("Addition is :"+ z);
    }
}
class Arithmetic extends Math
{
    Arithmetic(int l,int m)
    {
        x = l;
        y = m;
        
    }
    void cal()
    {
        add(x,y);
    }
}
public class AbstractClass 
{

    public static void main(String[] args)
    {
        Arithmetic a = new Arithmetic(3,4);
        a.cal();
    }
    
}
