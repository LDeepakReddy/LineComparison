package com.blz;

import java.util.Scanner;

public class LineComparison {


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        System.out.println("Enter the first line co-ordinates");
        Scanner SC = new Scanner(System.in);
        System.out.println("enter x1");
        int x1 = SC.nextInt();
        System.out.println("enter y1");
        int y1 = SC.nextInt();
        System.out.println("enter x2");
        int x2 = SC.nextInt();
        System.out.println("enter y2");
        int y2 = SC.nextInt();

        double lenofline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of 1st Line is " + lenofline1);

        System.out.println("Enter the second line co-ordinates");
        //Scanner SC=new Scanner(System.in);
        System.out.println("enter a1");
        int a1 = SC.nextInt();
        System.out.println("enter b1");
        int b1 = SC.nextInt();
        System.out.println("enter a2");
        int a2 = SC.nextInt();
        System.out.println("enter b2");
        int b2 = SC.nextInt();

        double lenofline2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Length of 2nd Line " + lenofline2);

    }
}
