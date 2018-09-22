package com.company;
import javax.sound.midi.SysexMessage;
import java.util.*;

interface Area
{
    final static float pi = 3.14F;
    float compute(float x,float y);
}

class Rectangle implements  Area
{
    public float compute(float x, float y)
    {
        return x*y;
    }
}
class Circle implements  Area
{
    public float compute(float x,float y)
    {
        return pi*x*x;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner in =  new Scanner(System.in);
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Area a;
        a = r;
        System.out.println(a.compute(2,3));
        a = c;
        System.out.println(a.compute(2,3));
    }
}
