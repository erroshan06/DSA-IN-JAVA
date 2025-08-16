package IFELSE;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an integer to find its absolute value:  ");
        int n = sc.nextInt();
         if (n>=0){
             System.out.println("The absolute value of " + n + " is " + n);
         }
         else
         {
             System.out.print("The absolute value of " + n + " is ");
             n= -n ;
             System.out.println(n);
         }
    }
}
