package com.iu;
import java.util.Scanner;
public class ar {
    int[] a=new int[5];
    Scanner s=new Scanner(System.in);

    public void t()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(" Enter the "+(i+1)+" element");
            a[i]=s.nextInt();
        }
        System.out.println("The numbers are:");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }

    public void c()
    {
        int u=0;
    for(int i=0;i<5;i++)
    {
         u=u+a[i];
    }
        System.out.println("The sum of the numbers: "+u);
    }
}
