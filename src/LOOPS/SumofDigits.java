package LOOPS;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {





        System.out.println("Enter the number :");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt() ;
        int sum= 0;
        n = Math.abs(n); // to handle negative number
        do{
            int rem = n% 10 ;
            sum +=rem;
            n/=10 ;


        }while( n !=0);
        System.out.println("Sum  of digits :"+ sum);
    }
}


