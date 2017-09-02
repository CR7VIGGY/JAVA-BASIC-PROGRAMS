
package anonymousarray;
import java.util.Scanner;
//new import 
import static java.lang.System.out;
public class AnonymousArray
{
    
    //passing array without object and declaring a array in main
    void print(int arr[])
    {
        out.println(arr[2]);
    }
    public static void main(String[] args)
    {
        AnonymousArray a = new AnonymousArray();
        System.out.println("Array is:");
        a.print(new int [] {2,3,4,5,6});
    }
    
}
