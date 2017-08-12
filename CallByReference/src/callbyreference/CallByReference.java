
package callbyreference;
import java.util.Scanner;
class Test
{
    int a,b;
    void ref(Test t2)
    {
        t2.a++;
        t2.b++;
    }
}
public class CallByReference
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Test t1 = new Test();
        Test t3 = new Test();
        t1.a = 15;
        t1.b = 20;
        System.out.println("Value of A n B before call :"+t1.a+" "+t1.b);
        
        t3.ref(t1);
        
        System.out.println("Value of A n B after call :"+t1.a+" "+t1.b);
    }
    
}
