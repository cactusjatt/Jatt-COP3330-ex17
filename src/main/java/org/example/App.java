/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class App {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        while (!in.hasNextInt()) in.next();
        int gender = in.nextInt();
        double r = gender == 1 ? 0.73 : 0.66;

        System.out.print("How many ounces of alcohol did you have? ");
        while (!in.hasNextInt()) in.next();
        int A = in.nextInt();
        System.out.print("What is your weight, in pounds? ");
        while (!in.hasNextInt()) in.next();
        int W = in.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        while (!in.hasNextInt()) in.next();
        int H = in.nextInt();

        System.out.println();

        double BAC = (A * 5.14 / W * r) - 0.015 * H;
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println("Your BAC is " + df.format(BAC));

        String s = BAC > 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.println(s);

        in.close();
    }
}