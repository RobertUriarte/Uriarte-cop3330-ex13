/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
import java.lang.Math;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        System.out.printf("Enter the number of times the interest is compounded per year: ");
        int times = scan.nextInt();
        double compound_interest = principal * Math.pow(1+(rate/100)/times,times*years );
        System.out.printf("$%.0f invested at %.2f percent, for %d years compounded %d times per year is $%.2f",principal,rate,years,times,compound_interest);
    }
}