package IFELSE;

import java.util.Scanner;

public class isSideof_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("yes , these number can be side of triangle ");

        } else
            System.out.println("invalid number");

    }
}