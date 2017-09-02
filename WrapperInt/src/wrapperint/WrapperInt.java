
package wrapperint;
import static java.lang.System.out;
public class WrapperInt 
{

    public static void main(String[] args) 
    {
        Integer x = new Integer(150);
        System.out.println("value :"+x);
        String bin = Integer.toBinaryString(59);
        String hex = Integer.toHexString(45);
        String oct = Integer.toOctalString(30);
        
        out.println("Binary of 59 :"+bin);
        out.println("Hexadecimal of 45 :"+hex);
        out.println("Octal of 30 :"+oct);
        
    }
}
