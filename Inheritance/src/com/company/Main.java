package com.company;
import java.util.Scanner;

class Room
{
    int l,w;
    Room(int x,int y)
    {
        l=x;
        w=y;
    }
    int area()
    {
        return l*w;
    }
}

class BedRoom extends Room
{
    int h;
    BedRoom(int x,int y,int z)
    {
        super(x,y);
        h = z;
    }
    int volume()
    {
        return l*w*h;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter L,W,H of room : ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        BedRoom b = new BedRoom(x,y,z);
        System.out.println("Area:"+b.area());
        System.out.println("Volume:"+b.volume());
    }
}
