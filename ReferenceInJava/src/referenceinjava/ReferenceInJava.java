
package referenceinjava;
class A
{
    int i;
    void show()
    {
        System.out.println("class A i : "+i);
    }
}
class B extends A
{
    int j,k;
    void show()
    {
        System.out.println("class B sum :"+(i+j+k));
    }
    void sum()
    {
        System.out.println("sum :"+ (i+j+k));
    }
}
public class ReferenceInJava 
{

    public static void main(String[] args) 
    {
       A a;
       B b = new B();
       b.j = 15;
       b.k = 20;
       b.i = 10;
       b.show();
       a = b;//a is a reference  a->b
       a.show();
      /* a.sum();*/ //we cannot use sum because in line 34 we can only copy the common things b/w a and b object
    }
    
}
