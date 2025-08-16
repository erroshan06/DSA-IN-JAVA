package IFELSE;

import java.util.Scanner;

public class IsIntegers {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println( "Enter the number: ");
        double n = sc.nextDouble();

        if (n -(int)n== 0){
            System.out.println(n+" is an integers ");

        }

        else
            System.out.println(n+"is not an integers ");


    }
}
