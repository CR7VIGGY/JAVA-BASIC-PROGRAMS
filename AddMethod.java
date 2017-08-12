//adding methods
import java.util.Scanner;
class Circle
{
public
	Scanner in = new Scanner(System.in);
	int radius;
	float area,peri;
	
	protected void input()
	{
		System.out.println("enter radius");
		radius = in.nextInt();
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
class AddMethod
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Circle c = new Circle();
		c.input();
		c.cal();
		c.output();
	}
}
