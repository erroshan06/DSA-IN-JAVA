package LOOPS;

import java.util.Scanner;

public class CountNoofDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt() ;
        int count = 0;
        do{
          n/=10 ;
              count ++;

        }while( n !=0);
        System.out.println("number of digits :"+ count);
    }
}
