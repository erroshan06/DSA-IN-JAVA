package BASICS;

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");

        double p = sc.nextDouble();
        System.out.println("Enter interest rate (in %) : ");
        double r = sc.nextDouble();

        System.out.println("Enter the time ( in year): ");
        float t   = sc.nextFloat();
        double  Interest = (p*r*t)/100;
        System.out.print("Simple intrest = "+Interest);

    }
}
