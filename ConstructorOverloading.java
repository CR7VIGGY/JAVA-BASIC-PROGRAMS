//adding methods with constructor overloading

import java.util.Scanner;

class Box
{
	
Scanner in = new Scanner(System.in);
	
int l,b,h;
	

	
Box()//constructoroverloading
	
{
		l = b = h = 10;
	}
	
Box(int x,int y)
	
{
		l = x;
		b = y;
	}
	
Box(int x,int y,int z)
	
{
		l = x;
		b = y;
		h = z;
	}
	
	
}


class ConstructorOverloading

{
	public static void main(String args[])

	{
		Scanner in = new Scanner(System.in);
		
int x,y,z;
		Box a = new Box();
		
System.out.println(a.l+a.b+a.h);
		
Box b = new Box(20,20);
		
System.out.println(b.l+b.b+b.h);
		
Box c = new Box(30,30,30);
		
System.out.println(c.l+c.b+c.h);
		
	
}	

}
