package com.abc;
import java.util.Scanner;
public class avenger {
    String name;
    int age;
    String power;
    String weapon;
    String planet;
    Scanner s=new Scanner(System.in);

    public void getDetails()
    {
        System.out.println("Enter the name of the character: ");
        name=s.nextLine();
        System.out.println("Enter the age of the character: ");
        age=s.nextInt();
        System.out.println("Enter the power of the character: ");
        s.nextLine();
        power=s.nextLine();
        System.out.println("Enter the weapon of the character: ");
        weapon=s.nextLine();
        System.out.println("Enter the planet of the character: ");

        weapon=s.nextLine();

    }

    public void displayDetails()
    {
        System.out.println("The name is "+name+", the age is "+age+", the power is "+power+" and the weapon is "+weapon);
    }

}
