
package dynamicmethoddispatch;
import java.util.Scanner;
//applying run time polymorphism
class Principal
{
    void message()
    {
        System.out.println("This is Principal");
    }
}
class Professor extends Principal
{
    void message()
    {
        System.out.println("This is Professor");
    }
}
class Lecturer extends Professor
{
    void message()
    {
        System.out.println("This is Lecturer");
    }
}
public class DynamicMethodDispatch
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Principal x = new Principal();
        Professor y = new Professor();
        Lecturer z = new Lecturer();
        Principal ref;                         //run time polymorphism , creating ref objects of super class
        ref = x;
        ref.message();
        ref = y;
        ref.message();
        ref = z;
        ref.message();
                
    }
    
}
