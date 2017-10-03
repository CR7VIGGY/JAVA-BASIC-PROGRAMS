package hybridinheritance;
import java.util.Scanner;
//this code snippet applies multiple , single inheritance and making multiple inheritance succesfull using interfaces.
class Roll
{
    Scanner in = new Scanner(System.in);
    int roll;
    void getdata()
    {
        System.out.println("enter ur roll :");
        roll = in.nextInt();
        
    }
}

class Marks extends Roll
{
    int x,y;
    void getmarks()
    {
        System.out.println("enter marks in math and physics");
        x = in.nextInt();
        y = in.nextInt();
    }
}

interface Sport
{
   int age = 18;
   void display();

}

class Result extends Marks implements Sport
{
    void show()
    {
        System.out.println("Total marks : "+(x+y));
        System.out.println("roll no :"+ roll);
        
    }
    @Override
   public void display()
    {
        System.out.println("age : 18");
    }
}
public class HybridInheritance
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       Result r = new Result();
       r.getdata();
       r.getmarks();
       r.show();
       r.display();
    }
    
}
