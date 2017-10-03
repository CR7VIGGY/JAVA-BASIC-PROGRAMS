package exceptiophandling;
import java.util.Scanner;
public class ExceptiopHandling
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int a,b,c,d;
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      d = in.nextInt();
      int ans = 0;
      try
      {
          ans = (a+b)/(c-d);
          //try throws exception in a different way as c++ does.the exceptions are predefined.
      }
      catch(ArithmeticException e)
      {
          System.out.println("it forms undefined answers");
      }
      finally //when a statement is defined as finally it has to occurr whether it exits or not
      {
          System.out.println(ans);
      }
    
    }
}
