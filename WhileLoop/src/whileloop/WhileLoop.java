
package whileloop;
import java.util.Scanner;
import java.lang.Math;
public class WhileLoop 
{
    public static void main(String[] args) 
    {
        int x,y,sum= 0,z = 0,sum1 = 0;
        Scanner in = new Scanner(System.in);
       /* x = in.nextInt();
        int fac = 1 ;
        
        System.out.println(fac(x));
      
        y = 1;
        while(y<10)
        {
            sum += y;
            y++;
        }
        System.out.println(sum);
        
        while(y<11)
        {
            z = in.nextInt();
            sum1 = sum1+z;
            y++;
        }
        System.out.print(sum1);
        System.out.println("sum 0f entered no. are");*/
        int a;
        //a = add();
        System.out.println(add());
    }
    //recursion
   /* public static int fac(int x)
    {
        if(x == 0)
            return 1;
        else
            return x*fac(x-1);
    }*/
    public static int add()
    {
        Scanner in = new Scanner(System.in);
        int b,num = 0,ans = 0,cnt = 0;
        //System.out.println(b);
        num = in.nextInt();
        while(num >=1)
        {
            b = num%10;
            ans = ans + b;
            num = num/10;
        }
        return ans;
    }
}
