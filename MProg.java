//classes and objects
import java.util.Scanner;
class Country
{
	long pop;
	int nos;
	float currency;
}
class MProg
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Country india = new Country();
		System.out.println("enter the population of your country");
		india.pop = in.nextLong();
		System.out.println("enter the no. of states of your country");
		india.nos = in.nextInt();
		System.out.println("enter the currency of your country");
		india.currency = in.nextFloat();
		System.out.println("population of your country is:");
		System.out.println(india.pop);
		System.out.println("no. of states in your country is:");
		System.out.println(india.nos);
		System.out.println("currency of your country is:");
		System.out.println(india.currency);
	}
}

