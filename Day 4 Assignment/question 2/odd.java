package com.o;
import java.util.Scanner;
public class odd {
    int[] a=new int[5];
   Scanner s=new Scanner(System.in);
   public void aa() {
       for (int i = 0; i < 5; i++) {
           System.out.println("Enter the " + (i + 1) + " element: ");
           a[i] = s.nextInt();
       }
       System.out.println("The numbers are: ");
       for (int i = 0; i < 5; i++) {
           System.out.println(a[i]);
       }
   }
   public void od()
   {
       System.out.println("The odd numbers are: ");
       for(int i=0;i<5;i++)
       {
           if(a[i]%2!=0)
           {
               System.out.println(a[i]);
           }
       }
   }
}
