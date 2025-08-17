package LOOPS;

import java.util.Scanner;

public class CompositeNUmber {
    public static void main(String[] args) {
        System.out.print("Enter the the number to check if it is  composite: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
    boolean isPrime = true;
       if (n<=1) {
           System.out.println("neither  prime nor composite ");
           return;
       }
           for (int i = 2 ; i<=Math.sqrt(n) ; i++ ){
            if (n  % i == 0){
                 isPrime = false ;

                break ;
            }


        }
        if (isPrime == true ) {
            System.out.println(n + " is a prime number  ");
        }
        else
            System.out.println(n +" is a composite number  ");
    }
}
