
package callbyvalue;
import java.util.Scanner;
class Test
{
    void ref(int i,int j)
    {
        i++;
        j++;
    }
}
public class CallByValue
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Test t = new Test();
        int a = 15;
        int b = 20;
        System.out.println("Value of A n B before call :"+a+" "+b);
        
        t.ref(15, 20);//it will not change the values of a & b, it will affect only i,j
        System.out.println("Value of A n B after call :"+a+" "+b);
    }
    
}
