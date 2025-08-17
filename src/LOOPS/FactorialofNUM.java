package LOOPS;

import java.util.Scanner;

public class FactorialofNUM {
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc  = new Scanner( System.in);
        int n = sc.nextInt();
        int fact = 1 ;
        for (int i = 1 ; i<= n ; i++){
            if (i!= n)
            System.out.print( i+"*");
            else System.out.print(i);
            fact *= i ;

        }
        System.out.println( " = " +fact);
    }
}
