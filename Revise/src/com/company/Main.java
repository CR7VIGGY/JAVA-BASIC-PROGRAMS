package com.company;
import java.util.Scanner;

class Rectangle
{
    Scanner in = new Scanner(System.in);
    int l,w;
    Rectangle(int x,int y)
    {
        l = x;
        w = y;
    }
   /* int getdata()
    {
        System.out.println("Enter Length and Width of Rectangle : ");
        l = in.nextInt();
        w = in.nextInt();
        return 0;
    }*/

    int area()
    {
        return l*w;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Rectangle r = new Rectangle(2,3);
       // r.getdata();
        System.out.println(r.area());
    }
}
