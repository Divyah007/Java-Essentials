package com.one;
import java.util.Scanner;
public class q1 {
   int m,p,c,z,b;

    Scanner s = new Scanner(System.in);
    public void data() {

        System.out.println("1) Enter the marks out of 100 for Maths: ");
         m = s.nextInt();

        System.out.println("2) Enter the marks out of 100 for Physics: ");
         p = s.nextInt();

        System.out.println("3) Enter the marks out of 100  for Chemistry: ");
         c = s.nextInt();

        System.out.println("4) Enter the marks out of 100 for Zoology: ");
         z = s.nextInt();

        System.out.println("5) Enter the marks out of 100 for Botany: ");
         b = s.nextInt();
    }
        public void grade () {
            int t = m + p + c + z + b;
            int pe = t/5;
            System.out.println("The total: "+t+"/500");
            System.out.println("The Percentage: "+pe+"%");

            if (pe >= 90 && pe <= 100) {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is O GRADE");
            } else if (pe >= 80 && pe < 90) {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is A GRADE");
            } else if (pe >= 70 && pe < 80) {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is B GRADE");
            } else if (pe >= 50 && pe < 70) {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is C GRADE");
            } else if (pe >= 35 && pe < 50) {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is D GRADE");
            } else// (pe >= 0 && pe < 35)
            {
                System.out.println("The percentage secured is " + pe + "% and the grade obtained is F GRADE");
            }
        }
    }
