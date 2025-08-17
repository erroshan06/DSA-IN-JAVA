package LOOPS;

import java.util.Scanner;

public class ApowerB {
    public static void main(String[] args) {
        System.out.println("enter a and b :");
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int pow = 1;
//        for (int i = 1 ; i<=b ; i++){
//            pow *= a ;
//
//        }


        double result = Math.pow( a , b);
        System.out.println(result);
    }
}
