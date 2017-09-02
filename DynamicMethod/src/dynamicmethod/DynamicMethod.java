//hierarchical inheritance example with Dynamic Method and reference objects
package dynamicmethod;

class Square
{
    int side;
    Square()
    {
        
    }
    Square(int x)
    {
        side = x;
    }
    void area()
    {
        int val;
        val = side*side;
        System.out.println("Area of Square :"+val);
    }
}
class Rectangle extends Square
{
    int len,wid;
    Rectangle(int x,int y)
    {
        len = x;
        wid = y;
    }
    
    @Override
    void area()
    {
        int val;
        val = len*wid;
        System.out.println("Area of Rectangle :"+val);
    }
}
class Circle extends Square
{
    float rad;
    Circle(float x)
    {
        rad = x;
    }
    @Override
    void area()
    {
        float val;
        val = (3.14f)*rad*rad;
        System.out.println("Area of Circle :"+val);
    }
}
public class DynamicMethod
{

    public static void main(String[] args) 
    {
      Square x = new Square(5);
      Rectangle y = new Rectangle(10,5);
      Circle z = new Circle(4.2f);
          Square ref;
          ref = x;
          ref.area();
          
          ref = y;
          ref.area();
          
          ref = z;
          ref.area();
    }
    
}
