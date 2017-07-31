
package switchstat;
import java.util.Scanner;
import java.lang.Math;
public class SwitchStat 
{

    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      int x,y = 0;
      x = in.nextInt();
      System.out.println("enter no 1 to find +/- \n enter 2 to find even \n odd enter 3 to find square \n enter 4 to find square root \n enter 5 to exit ");
      y = in.nextInt();
      switch(y)
      {
          case 1: System.out.println("Welcome");
                  if(x >= 0)
                  {
                      System.out.println("positive no.");
                  }
                  else
                  {
                      System.out.println("negative no.");
                  }
                    break;
          case 2 : System.out.println("Welcome");
                  if(x%2 == 0)
                  {
                      System.out.println("even no.");
                  }
                  else
                  {
                      System.out.println("odd no.");
                  }
                    break;
          case 3: System.out.println("Welcome");
                  int num ;
                  num = x*x;
                  System.out.println(num);
                    break;
          case 4 : System.out.println("Welcome");
                   double num1 = 0;
                    num1 = Math.sqrt(x);
                    System.out.println(num1);
                    break;
          case 5 :  break;
      }
    }
    
}
