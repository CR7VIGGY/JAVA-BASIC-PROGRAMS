
package findmax;
import java.util.Scanner;
public class FindMax 
{

    public static void main(String[] args) 
    {
        int a,i;
        System.out.println("enter array size");
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        int x[] = new int[a] ;
        
        for(i = 0 ; i < a ; i++)
        {
            x[i] = in.nextInt();
        }
                
        int max = x[0];
        int j,k;
        System.out.println("Array is :");
        for(i = 0 ; i < x.length ; i++)
        {
            System.out.print(x[i]+" ");
            
        }
        for(i = 0 ; i < x.length ; i++)
        {
            if(x[i]>max)
            {
                max = x[i];
            }
        }
        System.out.println("\nMAX is:"+max);
    }
    
}
