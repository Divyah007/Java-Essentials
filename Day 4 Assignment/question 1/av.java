package com.abc;

public class av {

    public static void main(String[] args) {
        System.out.println("AVENGERS");

        avenger[] a=new avenger[5];
        for(int i=0;i<5;i++)
        {
            a[i]=new avenger();
            a[i].getDetails();
            a[i].displayDetails();
        }
    }
}
