package arrayinputoutput;
import java.util.Scanner;
public class ArrayInputOutput 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //array
        int a,i,j;
        a = in.nextInt();
        int x[] = new int[a];
       
       
        for(i = 0 ;i < a ; i++)
        {
            x[i] = in.nextInt();
        }
        for(i = 0 ; i< a ; i++)
        {
            System.out.print(x[i]);
        }
        
        int m,n;
        m = in.nextInt();
        n = in.nextInt();
        int y[][]= new int[m][n];
        
        for(i = 0 ; i < m ; i++)
        {
            for(j = 0 ; j < n ; j++)
            {
                y[i][j] = in.nextInt();
            }
        }
        for(i = 0 ; i < m ; i++)
        {
            for(j = 0 ; j < n ; j++)
            {
                System.out.println(y[i][j]);
            }
        }
    }
    
}
