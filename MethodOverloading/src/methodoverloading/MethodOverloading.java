
package methodoverloading;
import java.util.Scanner;
class Overloading
{
    float add(float x,float y)
    {
        float z;
        z = x+y;
        System.out.println(z);
        return 0;
    }
    int add(int x,int y)
    {
        int z;
        z = x+y;
        System.out.println(z);
        return 0;
    }
    float area(float z)
    {
        float ar;
        ar = z*z;      
        return 0;
    }
}

public class MethodOverloading 
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       Overloading a = new Overloading();
       int e,b;
       float c,d;
       e = in.nextInt();
       b = in.nextInt();
       c = in.nextFloat();
       d = in.nextFloat();
       a.add(c,d);
       a.add(e,b);
       
    }
    
}
