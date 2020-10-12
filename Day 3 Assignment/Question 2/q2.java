package com.two;
import java.util.Scanner;
public class q2 {
    Scanner s=new Scanner(System.in);
    String n;
    int dob;
    String mob;
    int yob;
    float ms;
    public void data()
    {
        System.out.println("Enter the Employee's Full Name: ");
        n=s.nextLine();

        System.out.println("Enter the Employee's Date of born (1-31): ");
        dob=s.nextInt();

        System.out.println("Enter the Employee's Month of born (Jan-Dec): ");
        mob=s.next();

        System.out.println("Enter the Employee's Year of born (yyyy): ");
        yob=s.nextInt();

        System.out.println("Enter the Employee's Monthly Salary (enter only in numbers): ") ;
        System.out.print("₹.");
        ms=s.nextFloat();
    }

    public void a()
    {
        float as=ms*12;
        int g=2020-yob;
        System.out.println("The Employee's Name: "+n);
        System.out.println("The Employee's Age: "+g);
        System.out.println("The Employee's Annual Salary: ₹."+Math.round(as));
        if(as>=500000)
        {
            float t=0.20f*as;
            System.out.println("The amount of tax to be paid: ₹."+Math.round(t));
        }

        else if(as>=400000)
        {
            float t=0.15f*as;
            System.out.println("The amount of tax to be paid: ₹."+Math.round(t));
        }
        else if(as>=300000)
        {
            float t= 0.10f*as;
            System.out.println("The amount of tax to be paid: ₹."+Math.round(t));
        }
        else if(as>=200000)
        {
            float t= 0.05f*as;
            System.out.println("The amount of tax to be paid: ₹."+Math.round(t));
        }
        else// below 200000
        {
            System.out.println("No Tax to be paid");
        }

    }
}
