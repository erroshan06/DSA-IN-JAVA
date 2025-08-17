package LOOPS;

import java.util.Scanner;

public class ReverseanditsSum {
    public static void main(String[] args) {





        System.out.print("Enter the number :");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt() ;
        int original = n ;
        int sum = 0;
        int reverse= 0;
        do{
            int rem = n% 10 ;
            sum +=rem ;
            reverse =reverse *10 +rem ;
            System.out.print(rem);
            n/=10 ;

        }while( n !=0);
        int result = (original < 0) ? -(Math.abs(original) + reverse) : (original + reverse);
        System.out.println("\nOriginal number: " + original);
        System.out.println("Reversed number: " + (original < 0 ? -reverse : reverse));


        System.out.println("Original + Reverse :"+ result );
    }
}


