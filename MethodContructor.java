//adding methods
import java.util.Scanner;
class Circle
{
public
	Scanner in = new Scanner(System.in);
	int radius;
	float area,peri;
	
	Circle(int x)//constructor
	{
		radius = x;
	}
	
	void cal()
	{
		final float pi = 3.14f;
		peri = 2.0f*pi*(float)radius;//type casting
		area = pi*(float)(radius*radius);
	}
	void output()
	{
		System.out.println("Area is :"+area);
		System.out.println("perimeter is :"+peri);
	}
}
class MethodContructor
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int x;
		System.out.println("enter radius");
		x = in.nextInt();
		Circle c = new Circle(x);//int x sent to constructor of circle class
		c.cal();
		c.output();
	}
}
