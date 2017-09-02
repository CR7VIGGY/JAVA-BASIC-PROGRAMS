package stringjava;
import java.util.Scanner;
//new import 
import static java.lang.System.out;
import java.lang.String;
public class StringJava 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringJava s = new StringJava();
        
        
        String a = in.next();
        String b = in.next();
        
        //length
        int y = a.length();
        out.println(y);
        //concat
        
        out.println(a.concat(b));
        //charAt
        out.println(a.charAt(2));
        
        //getbytes
        byte x[] = a.getBytes();
        for(int i = 0 ; i < y ; i++)
            out.print(x[i]);
        //tochararay
        
        //substring
        out.println(a.substring(1,6));
        //toLowercase
        out.println(a.toUpperCase());
        
    }
    
}
